package places;

import org.fusesource.jansi.Ansi.Color;

public class garage extends places{
	
	boolean door = false;
	
	public void desc(){
		
		System.out.println("\n\n\nAs you stand in the garage you can still see you " + start.fg(Color.GREEN) + "car" + start.fg(Color.DEFAULT) + " is there. Your dad has been out to his work area, someone was working on shells and his " + start.fg(Color.GREEN) + "workbench" + start.fg(Color.DEFAULT) + " is covered. Mom is gone, because her car is gone (or someone else took it). Remember the kitchen is behind you and a door does go to the backyard.\n" + (door == true ? "The garage door is open." : ""));
		process();
		
	}
	
	public void commands(String com, String item){
		
		if(com.equalsIgnoreCase("drive")){
			
			if(item.equalsIgnoreCase("car")){
				
				if(door == true){
					
					System.out.println("\nYou get in and drive off to school in your car.");
					//school object
					
				}else{
					
					System.out.println("\nThe garage door is closed!");
					desc();
					
				}
				
			}else{
				
				desc();
				
			}
			
		}else if(com.equalsIgnoreCase("open")){
			
			if(item.equalsIgnoreCase("door")){
				
				System.out.println("\nYou press the button to open the garage door.");
				desc();
				
			}else{
				
				desc();
				
			}
			
		}else if(com.equalsIgnoreCase("search") || com.equalsIgnoreCase("explore") || com.equalsIgnoreCase("check")){
			
			if(item.equalsIgnoreCase("workbench")){
				
				System.out.println("\nYou find some wood shavings, what would dad have that for?\nGun powder, too! Never know when you might need some?\n");
				inv.addItem("wood shavings");
				inv.addItem("gun powder");
				desc();
				
			}else{
				
				desc();
				
			}
			
		}else if(com.equalsIgnoreCase("goto")){
			
			if(item.equalsIgnoreCase("kitchen")){
				
				kitchen kr = new kitchen();
				kr.flash_drive = flash_drive;
				kr.inv = inv;
				kr.desc();
				
			}else if(item.equalsIgnoreCase("backyard")){
				
				backyard by = new backyard();
				by.flash_drive = flash_drive;
				by.inv = inv;
				by.desc();
				
			}else{
				
				desc();
				
			}
			
		}else{
			
			desc();
			
		}
		
	}

}
