package places;

import org.fusesource.jansi.Ansi.Color;

public class frontyard extends places{
	
	public void desc(){
		System.out.println("\n\nYour front yard...is small. Not much to see. Your " + start.fg(Color.GREEN) + "friend" + start.fg(Color.DEFAULT) + " is on the sidewalk waiting though. You could go inside through the front " + start.fg(Color.GREEN) + "door" + start.fg(Color.DEFAULT) + ".");
		process();
	}
	
	public void commands(String com, String item){
		if(com.equalsIgnoreCase("goto")){
			if(item.equalsIgnoreCase("door")){
				frontDoor h = new frontDoor();
				if(flash_drive == true){
					h.flash_drive = true;
				}
				h.inv = inv;
				h.desc();
			}else if(item.equalsIgnoreCase("friend")){
				ti.personCheck("frontHouseFriend");
				desc();
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
