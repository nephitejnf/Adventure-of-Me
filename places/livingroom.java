package places;
import java.util.*;

import org.fusesource.jansi.Ansi.Color;

import item.inventory;
import item.armor;
import item.food;
import item.item;
import item.potion;
import item.weapon;

public class livingroom extends places{
	
	public void desc(){
		
		System.out.println("\n\nSomeone left the " + start.fg(Color.GREEN) + "TV" + start.fg(Color.DEFAULT) + " on although they were watching something interesting. You do have the option of going to the left into the " + start.fg(Color.GREEN) + "kitchen" + start.fg(Color.DEFAULT) + ". The couch is right in front of you.");
		process();
		
	}
	
	public void commands(String com, String item){
		if(com.equalsIgnoreCase("goto")){
			if(item.equalsIgnoreCase("kitchen")){
				kitchen k = new kitchen();
				if(flash_drive == true){
					k.flash_drive = true;
				}
				k.inv = inv;
				k.desc();
			}else if(item.equalsIgnoreCase("stairs")){
				frontDoor front = new frontDoor();
				if(flash_drive == true){
					front.flash_drive = true;
				}
				front.inv = inv;
				front.desc();
			}else{
				System.out.printf("Can't goto %s\n", item);
				desc();
			}
		} else if(com.equalsIgnoreCase("use")){
			if(item.equalsIgnoreCase("tv")){
				System.out.println("\n\nYou watch TV for a few hours and then mom interupts you saying, \"Get off your butt and do something!\".");
				desc();
			}else{
				desc();
			}
		} else if(com.equalsIgnoreCase("take")){
			desc();
		} else if(com.equalsIgnoreCase("eat")){
			
			if(item.equalsIgnoreCase("roll")){
				System.out.println("\n\nYou eat a " + inv.invFood[0].name + "!");
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
