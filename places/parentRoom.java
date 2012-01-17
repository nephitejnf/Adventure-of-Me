package places;
import java.util.*;

import org.fusesource.jansi.Ansi.Color;

import item.inventory;
import item.armor;
import item.food;
import item.item;
import item.potion;
import item.weapon;

public class parentRoom extends places{
	
	public void desc(){
		
		System.out.println("\n\nYour parents have a cleaner room than you, by far.\nIn front of you is their bed, to the left is their " + start.fg(Color.GREEN) + "closet" + start.fg(Color.DEFAULT) + ". The TV in here is on and they do have their " + start.fg(Color.GREEN) + "night stands" + start.fg(Color.DEFAULT) + " covered with medicine and " + start.fg(Color.GREEN) + "other things" + start.fg(Color.DEFAULT) + ".");
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
			}else if(item.equalsIgnoreCase("closet")){
				parentCloset pcl = new parentCloset();
				if(flash_drive == true){
					pcl.flash_drive = true;
				}
				pcl.inv = inv;
				pcl.desc();
			}else{
				System.out.printf("Can't goto %s\n", item);
				desc();
			}
		} else if(com.equalsIgnoreCase("use")){
			desc();
		} else if(com.equalsIgnoreCase("check")){
			if(item.equalsIgnoreCase("other things")){
				System.out.println("You find " + inv.invArmor[0].name + " and a " + inv.invItem[0].name + ", you take both, among other things.");
				inv.addItem("simple rags");
				inv.addItem("tin can");
				desc();
			}else if(item.equalsIgnoreCase("night stands")){
				System.out.println("You find a can of " + inv.invFood[3].name + " and take it.");
				inv.addItem("mountain crush");
				desc();
			}else if(item.equalsIgnoreCase("bed")){
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
