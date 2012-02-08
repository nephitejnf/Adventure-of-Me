package places;

public class backyard extends places{
	
	public void desc(){
		
		System.out.println("\n\nIn your backyard you can tell that your siblings were back here. There are toys all over the place, the grass is green though.\nA door does lead to the garage from the back.");
		process();
		
	}
	
	public void commands(String com, String item){
		
		if(com.equalsIgnoreCase("goto")){
			
			if(item.equalsIgnoreCase("garage")){
				
				garage go = new garage();
				go.flash_drive = flash_drive;
				go.inv = inv;
				go.desc();
				
			}else if(item.equalsIgnoreCase("kitchen")){
				
				kitchen ko = new kitchen();
				ko.flash_drive = flash_drive;
				ko.inv = inv;
				ko.desc();
				
			}else{
				
				desc();
				
			}
			
		}else if(com.equalsIgnoreCase("mow") || com.equalsIgnoreCase("cut")){
			
			if(item.equalsIgnoreCase("lawn") || item.equalsIgnoreCase("grass")){
				
				System.out.println("\nYou mow the lawn and now your mom should be happier.");
				
			}else{
				
				desc();
				
			}
			
		}else{
			
			desc();
			
		}
		
	}

}
