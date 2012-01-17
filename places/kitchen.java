package places;
import java.util.*;
import item.inventory;
import item.armor;
import item.food;
import item.item;
import item.potion;
import item.weapon;

public class kitchen extends places{
	
	public void desc(){
		
		System.out.println("\n\nTo the immediate left is the fridge, on the left wall is the range and on the wall in front of you is the sink. To the right, the table and on the wall there next to the counter and the table, the back door.");
		process();
		
	}
	
	public void commands(String com, String item){
		if(com.equalsIgnoreCase("goto")){
			if(item.equalsIgnoreCase("stairs")){
				frontDoor front = new frontDoor();
				if(flash_drive == true){
					front.flash_drive = true;
				}
				front.inv = inv;
				front.desc();
			}else if(item.equalsIgnoreCase("livingroom")){
				livingroom lroom = new livingroom();
				if(flash_drive == true){
					lroom.flash_drive = true;
				}
				lroom.inv = inv;
				lroom.desc();
			}else{
				System.out.printf("Can't goto %s\n", item);
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
