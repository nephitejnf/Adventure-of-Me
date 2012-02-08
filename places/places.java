package places;
import item.inventory;
import item.armor;
import item.food;
import item.item;
import item.potion;
import item.weapon;
import org.fusesource.jansi.*;
import org.fusesource.jansi.Ansi.Color;
import org.fusesource.jansi.Ansi.*;
import places.functions.*;
import java.util.*;

public class places {
	
	String areas[] = {"your bedroom", "your closet", "computer", "hall"};
	boolean flash_drive = false;
	item ito = new item();
	inventory inv = new inventory();
	Ansi start = new Ansi();
	talkFunction ti = new talkFunction();

	
	public void desc(){
		
	}
	
	public void process(){
		Scanner co = new Scanner(System.in);
		String s = co.nextLine();
		Scanner commands = new Scanner(s);
		String command = commands.next();
		
		if(commands.hasNext()){
			String item = commands.next();
			while(commands.hasNext()){
				item = item + " " + commands.next();
			}
			commands(command, item);
		}
		
		if(command.equalsIgnoreCase("inventory")){
			inv.displayInv();
			desc();
		}else if(command.equalsIgnoreCase("help")){
			globalHelp();
		}else{
			commands(command, "");
		}

	}
	
	public void commands(String com, String item){
		
	}
	
	public void globalHelp(){
		
		System.out.println("\n\tIn the game there are three colors you will see." + start.fg(Color.GREEN) + "\nGreen represents an area you can goto or an item in the room that can be acted on." + start.fg(Color.BLUE) + "\nBlue is only used in computer interactions or when using a computer." + start.fg(Color.RED) + "\nRed is used for item that are or can go in your inventory." + start.fg(Color.DEFAULT));
		help();
		
	}
	
	public void help(){
		
		desc();
		
	}
	
	public void read(){
		
		Random reader = new Random();
		String lines[] = {"\nAs a man thinketh so he reapeth.", "\nHeghlu'meH QaQ jajvam!", "\nEducate men without faith and you but make clever devils.", "\nYou can get more of what you want with a kind word and a gun than you can with just a kind word.\n~Al Capone", "\nThe great masses of people...Will more easily fall victims to a big lie than to a small one.\n~Adolf Hitler", "\nAll successful people, men and women, are big dreamers. They imagine what their future could be, ideal in every respect, and they work every day toward their vision, that goal or purpose.\n~Brian Tracy", "\nIf you want happiness for an hour - take a nap. If you want happiness for a day - go fishing. If you want happiness for a month - get married. If you want happiness for a year - inherit a fortune. If you want happiness for a lifetime - help someone else.\n~Chinese Proverb", "\nImpossible is a big word thrown around by small men who find it easier to live in the world they've been given than to explore the power they have to change it. Impossible is not a fact. It's an opinion. Impossible is not a declaration. It is a dare. Impossible is potential. Impossible is temporary. Impossible is nothing.\n~Muhammah Ali", "HoS'anna'! yIquv Qun'a' jen pong'e'!"};
		int line = reader.nextInt(lines.length);
		System.out.println(lines[line]);
		
	}
	
	public void talk(){
		
	}
	
	public void take(){
		
	}

}
