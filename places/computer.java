package places;

import java.util.*;
import org.fusesource.jansi.Ansi.*;
import org.fusesource.jansi.*;
import item.inventory;
import item.armor;
import item.food;
import item.item;
import item.potion;
import item.weapon;
import places.functions.computerFunctions;
import item.flashDrive;


public class computer extends places {
	
	Ansi as = new Ansi();
	
	public void desc(){
		
		System.out.println("\n\nWhat do you want to do at your computer? (Another number one)\n\n\t" + as.fg(Color.BLUE) + "1" + as.fg(Color.DEFAULT) + ": Play a game\n\t" + as.fg(Color.BLUE) + "2" + as.fg(Color.DEFAULT) + ": Browse the web\n\t" + as.fg(Color.BLUE) + "3" + as.fg(Color.DEFAULT) + ": " + ((flash_drive==true) ?"Browse flashdrive\n\t" + as.fg(Color.BLUE) + "4" + as.fg(Color.DEFAULT): "Leave"));
		process();
		
	}
	

	
	public void commands(String com, String item){
		
		if(com.equalsIgnoreCase("goto")){
			if(item.equalsIgnoreCase("bedroom")){
				bedroom b = new bedroom();
				if(flash_drive == true){
					b.flash_drive = true;
				}
				b.inv = inv;
				b.desc();
			}else if(item.equalsIgnoreCase("closet")){
				closet cl = new closet();
				if(flash_drive == true){
					cl.flash_drive = true;
				}
				cl.inv = inv;
				cl.desc();
			}else{
				desc();
			}
		} else if(com.equalsIgnoreCase("use")){
			desc();
		} else if(com.equalsIgnoreCase("take")){
			desc();
		} else if(flash_drive == true){
			if(com.equals("3")){
				flashDrive fd = new flashDrive();
				fd.askActions();
				desc();
			}else if(item.equalsIgnoreCase("4")){
				bedroom bd = new bedroom();
				bd.desc();
			}else{
				desc();
			}
		} else if(com.equals("3")){
			bedroom bd = new bedroom();
			bd.desc();
		}else{
			desc();
		}
		
	}

	

	public void talk(){
		
	}
	
	public void take(){
		
	}

}
