package places;
import java.util.*;

import org.fusesource.jansi.Ansi.Color;

import item.inventory;
import item.armor;
import item.food;
import item.item;
import item.potion;
import item.weapon;

public class bedroom extends places{
	

	
	public void desc(){
		
		System.out.println("\n\n\tYou are in your room. It's a mess with clothing all over the place and other miscellaneous stuff. It is recommended you clean it up.\n\tYou do have a " + start.fg(Color.GREEN) + "computer" + start.fg(Color.DEFAULT) + " in the corner and your " + start.fg(Color.GREEN) + "closet" + start.fg(Color.DEFAULT) + " next to it. Your dresser is on you right, opposite of the computer, your bed behind you and bedroom door, to the " + start.fg(Color.GREEN) + "hall" + start.fg(Color.DEFAULT) + ", in front of you.\n\tWhat are you going to do?");
		process();
		
	}
	

	
	
	public void commands(String com, String item){
		if(com.equalsIgnoreCase("goto")){
			if(item.equalsIgnoreCase("closet")){
				closet cl = new closet();
				if(flash_drive == true){
					cl.flash_drive = true;
				}
				cl.inv = inv;
				cl.desc();
			}else if(item.equalsIgnoreCase("computer")){
				computer co = new computer();
				if(flash_drive == true){
					co.flash_drive = true;
				}
				co.inv = inv;
				co.desc();
			}else if(item.equalsIgnoreCase("hall")){
				hall h = new hall();
				if(flash_drive == true){
					h.flash_drive = true;
				}
				h.inv = inv;
				h.desc();
			}else{
				System.out.printf("Can't goto %s\n", item);
				desc();
			}
		} else if(com.equalsIgnoreCase("use")){
			if(item.equalsIgnoreCase("computer")){
				computer co = new computer();
				if(flash_drive == true){
					co.flash_drive = true;
				}
				co.inv = inv;
				co.desc();
			} else {
				desc();
			}
		} else if(com.equalsIgnoreCase("clean")){
			System.out.println("Did no good trying, you didn't last long.");
			desc();
		} else if(com.equalsIgnoreCase("take")){
			desc();
		} else if(com.equalsIgnoreCase("eat")){
			
			if(item.equalsIgnoreCase("roll")){
				System.out.println("You eat a " + inv.invFood[0].name + "!");
				inv.removeItem(item);
				desc();
			}else{
				desc();
			}
			
		}else{
			System.out.printf("INVALID COMMAND %s", com);
			desc();
		}
		
	}

	
	public void take(){
		
	}

}
