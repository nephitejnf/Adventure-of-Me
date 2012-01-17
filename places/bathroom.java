package places;
import java.util.*;

import org.fusesource.jansi.Ansi.Color;

import item.inventory;
import item.armor;
import item.food;
import item.item;
import item.potion;
import item.weapon;

public class bathroom extends places{
	
	public void desc(){
		
		System.out.println("\n\nAhead of you is the toilet, right next to it is the bath tub, then the " + start.fg(Color.GREEN) + "sink" + start.fg(Color.DEFAULT) + ", which is next to the tub, is closer to you.");
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
			}else{
				process();
			}
		} else if(com.equalsIgnoreCase("use")){
			if(item.equalsIgnoreCase("sink")){
				System.out.println("\nYou wash your hands.");
				if(inv.checkItem("bottle") == 0){
					System.out.println("\nYou fill your " + inv.invItem[2].name + ".");
					inv.removeItem("bottle");
					inv.addItem("bottled water");
				}
				desc();
			}else{
				desc();
			}
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
