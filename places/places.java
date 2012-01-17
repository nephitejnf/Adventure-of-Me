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

import java.util.*;

public class places {
	
	String areas[] = {"your bedroom", "your closet", "computer", "hall"};
	boolean flash_drive = false;
	item ito = new item();
	inventory inv = new inventory();
	Ansi start = new Ansi();

	
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
		
		System.out.println("\n\tIn the game there are three colors you will see." + start.fg(Color.GREEN) + "\nGreen represents an area you can goto or an item in the room that can be acted on." + start.fg(Color.BLUE) + "\nBlue is only used in computer interactions or when using a computer." + start.fg(Color.RED) + "\nRed is used for item that are or can go in your inventory.");
		help();
		
	}
	
	public void help(){
		
		desc();
		
	}
	
	public void talk(){
		
	}
	
	public void take(){
		
	}

}
