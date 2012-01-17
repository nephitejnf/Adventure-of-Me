package places;
import java.util.*;

import org.fusesource.jansi.Ansi.Color;

import item.inventory;
import item.armor;
import item.food;
import item.item;
import item.potion;
import item.weapon;

public class parentCloset extends places{
	
	public void desc(){
		
		System.out.println("\n\nYour parent's closet is neater than your's, still.\nIt is easier to see things in their closet. Things there include " + start.fg(Color.GREEN) + "clothes" + start.fg(Color.DEFAULT) + ", " + inv.invFood[2].name + ", " + start.fg(Color.GREEN) + "books" + start.fg(Color.DEFAULT) + " and " + inv.invItem[1].name + ".");
		process();
		
	}
	
	public void commands(String com, String item){
		if(com.equalsIgnoreCase("goto")){
			
			if(item.equalsIgnoreCase("parents room") || item.equalsIgnoreCase("parent's room") || item.equalsIgnoreCase("parent's bedroom") || item.equalsIgnoreCase("parents bedroom")){
				parentRoom pRoom = new parentRoom();
				if(flash_drive == true){
					pRoom.flash_drive = true;
				}
				pRoom.inv = inv;
				pRoom.desc();
			}else{
				System.out.printf("Can't goto %s\n", item);
				desc();
			}
			
		} else if(com.equalsIgnoreCase("use")){
			desc();
		} else if(com.equalsIgnoreCase("check")){
			
			if(item.equalsIgnoreCase("clothes")){
				System.out.println("That's where your " + inv.invArmor[2].name + " went!");
				inv.addItem(item);
				desc();
			}else if(item.equalsIgnoreCase("books")){
				//gonna have a random thing here
				desc();
			}else if(item==""){
				System.out.println("\n\nYou find a " + inv.invItem[2].name + " and just put it in your pockets.");
				inv.addItem("Bottle");
				desc();
			}else{
				System.out.printf("\n\n\nNo %s", item);
				desc();
			}
			
		} else if(com.equalsIgnoreCase("take")){
			
			if(item.equalsIgnoreCase("candy")){
				System.out.println("You take some " + inv.invFood[2].name + ".");
				inv.addItem(item);
				desc();
			}else if(item.equalsIgnoreCase("batteries")){
				System.out.println("You take some " + inv.invItem[1].name + ".");
				inv.addItem(item);
				desc();
			}else{
				System.out.printf("\n\n\nNo %s\n", item);
				desc();
			}
			
		} else if(com.equalsIgnoreCase("eat")){
			
			if(item.equalsIgnoreCase("roll")){
				System.out.println("You eat a " + inv.invFood[0].name + "!");
				inv.removeItem(item);
				desc();
			} else {
				System.out.printf("\n\nNo %s\n", item);
				desc();
			}
			
		} 
		
	}

}
