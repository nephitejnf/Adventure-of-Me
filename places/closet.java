package places;
import java.util.*;
import item.inventory;
import item.armor;
import item.food;
import item.item;
import item.potion;
import item.weapon;

public class closet extends places{
	
	public void desc(){
		
		System.out.println("\n\nYour closet is much like your room...messy. Can't tell what is in there.");
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
			}else if(item.equalsIgnoreCase("computer")){
				computer co = new computer();
				if(flash_drive == true){
					co.flash_drive = true;
				}
				co.inv = inv;
				co.desc();
			}else{
				System.out.printf("Can't goto %s\n", item);
				desc();
			}
		} else if(com.equalsIgnoreCase("use")){
			desc();
		} else if(com.equalsIgnoreCase("take")){
			desc();
		} else if(com.equalsIgnoreCase("explore")){
			System.out.println("As you were going through your stuff, you find your lost flashdrive.");
			flash_drive = true;
			desc();
		} else if(com.equalsIgnoreCase("eat")){
			if(item.equalsIgnoreCase("roll")){
				System.out.println("You eat a roll!");
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
