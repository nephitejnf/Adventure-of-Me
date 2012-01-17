package places;
import java.util.*;

import org.fusesource.jansi.Ansi.Color;

import item.inventory;
import item.armor;
import item.food;
import item.item;
import item.potion;
import item.weapon;

public class frontDoor extends places{
	
	public void desc(){
		
		System.out.println("\n\nYou are practically kissing the door now, not really. Ahead is the " + start.fg(Color.GREEN) + "kitchen" + start.fg(Color.DEFAULT) + " and to the right is the " + start.fg(Color.GREEN) + "livingroom" + start.fg(Color.DEFAULT) + ".");
		process();
		
	}
	
	public void commands(String com, String item){
		if(com.equalsIgnoreCase("goto")){
			if(item.equalsIgnoreCase("hall")){
				hall h = new hall();
				if(flash_drive == true){
					h.flash_drive = true;
				}
				h.inv = inv;
				h.desc();
			}else if(item.equalsIgnoreCase("kitchen")){
				kitchen k = new kitchen();
				if(flash_drive == true){
					k.flash_drive = true;
				}
				k.inv = inv;
				k.desc();
			}else if(item.equalsIgnoreCase("livingroom")){
				livingroom lroom = new livingroom();
				if(flash_drive == true){
					lroom.flash_drive = true;
				}
				lroom.inv = inv;
				lroom.desc();
			}else{
				desc();
			}
		} else if(com.equalsIgnoreCase("use")){
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
			desc();
		}
		
	}

}
