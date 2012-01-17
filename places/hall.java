package places;
import java.util.*;

import org.fusesource.jansi.Ansi.Color;

import item.inventory;
import item.armor;
import item.food;
import item.item;
import item.potion;
import item.weapon;

public class hall extends places{
	

	
	public void desc(){
		
		System.out.println("\n\nIn the hall, standing just outside your " + start.fg(Color.GREEN) + "bedroom" + start.fg(Color.DEFAULT) + ", to your right is the " + start.fg(Color.GREEN) + "bathroom" + start.fg(Color.DEFAULT) + ", and then down the hall is your " + start.fg(Color.GREEN) + "parents bedroom" + start.fg(Color.DEFAULT) + ", to your left the " + start.fg(Color.GREEN) + "stairs" + start.fg(Color.DEFAULT) + " to the front enterance.\n(You can use " + start.fg(Color.GREEN) + "right" + start.fg(Color.DEFAULT) + ", " + start.fg(Color.GREEN) + "left" + start.fg(Color.DEFAULT) + " or " + start.fg(Color.GREEN) + "straight" + start.fg(Color.DEFAULT) + " here.)");
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
			} else if(item.equalsIgnoreCase("right") || item.equalsIgnoreCase("bathroom")){
				bathroom bath = new bathroom();
				if(flash_drive == true){
					bath.flash_drive = true;
				}
				bath.inv = inv;
				bath.desc();
			} else if(item.equalsIgnoreCase("straight") || item.equalsIgnoreCase("parents bedroom")){
				parentRoom pRoom = new parentRoom();
				if(flash_drive == true){
					pRoom.flash_drive = true;
				}
				pRoom.inv = inv;
				pRoom.desc();
			} else if(item.equalsIgnoreCase("left") || item.equalsIgnoreCase("stairs")){
				frontDoor front = new frontDoor();
				if(flash_drive == true){
					front.flash_drive = true;
				}
				front.inv = inv;
				front.desc();
			}else{
				desc();
			}
		} else if(com.equalsIgnoreCase("use")){
			desc();
		} else if(com.equalsIgnoreCase("clean")){
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

	
	public void talk(){
		
	}
	
	public void take(){
		
	}

}
