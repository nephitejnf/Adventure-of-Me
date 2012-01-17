package item;

import java.util.Scanner;
import places.functions.*;
import org.fusesource.jansi.*;
import org.fusesource.jansi.Ansi.Color;
import org.fusesource.jansi.Ansi.*;

public class flashDrive {
	
	public void askActions(){
		Ansi start = new Ansi();
		System.out.println("What do you need to do on your flashdrive?:\n\t" + start.fg(Color.BLUE) + "1" + start.fg(Color.DEFAULT) + ": Homework\n\t" + start.fg(Color.BLUE) + "2" + start.fg(Color.DEFAULT) + ": Play Fortresscraft");
		process();
		
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
			whatActions(command, item);
		}
		
		whatActions(command, "");
	}
	
	public void whatActions(String c, String i){
		
		if(c.equals("1")){
			computerFunctions cf = new computerFunctions();
			cf.homework();
			askActions();
		}else if(c.equals("2")){
			computerFunctions cf = new computerFunctions();
			cf.minecraft();
			askActions();
		}else if(c.equals("3")){
			askActions();
		}else{
			askActions();
		}
		
	}

}
