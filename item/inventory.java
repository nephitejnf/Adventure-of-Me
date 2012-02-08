package item;

import java.awt.*;
import java.util.*;
import java.util.List;
import org.fusesource.jansi.*;
import org.fusesource.jansi.Ansi.Color;
import org.fusesource.jansi.Ansi.*;

public class inventory {
	
	public item invItem[]= {new item(), new item(), new item(), new item(), new item(), new item(), new item(), new item()};
	public armor invArmor[] = {new armor(), new armor(), new armor()};
	public weapon invWeapon[] = {new weapon()};
	public food invFood[] = {new food(), new food(), new food(), new food()};
	public potion invPotion[] = {new potion()};
	
	public List<item> itemInvento = new ArrayList<item>();
	public List<armor> armorInvento = new ArrayList<armor>();
	public List<weapon> weaponInvento = new ArrayList<weapon>();
	public List<food> foodInvento = new ArrayList<food>();
	public List<potion> potionInvento = new ArrayList<potion>();
	
	Ansi start = new Ansi();
	
	
	{
		///////random items///////////
		//tin can
		invItem[0].name="Tin Can";
		invItem[0].description="A simple can made of aluminum.";
		//batteries
		invItem[1].name="Batteries";
		invItem[1].description="They power things, enough said!";
		//bottle
		invItem[2].name="Bottle";
		invItem[2].description="Empty bottle";
		//wood shavings
		invItem[3].name="Wood Shavings";
		invItem[3].description="Basic sawdust and wood scraps, highly flammable. :)";
		//gun powder
		invItem[4].name="Gun Powder";
		invItem[4].description="Fun to burn, 'nuff said.";
		//arrow
		invItem[5].name="Arrow";
		invItem[5].description="An arrow that is shot from a bow.";
		//knee
		invItem[6].name="Knee";
		invItem[6].description="A knee, we all have atleast two.";
		//arrow in the knee
		invItem[7].name="Arrow in the Knee";
		invItem[7].description="Sounds familiar, like a meme.";
		//paper
		invItem[8].name="Paper";
		invItem[8].description="A sheet of paper";
		
		//////armor///////////
		//settings for rags
		invArmor[0].name="Simple Rags";
		invArmor[0].description="They are just rags, nothing special. Please don't where them.";
		//notch's hat
		invArmor[1].name="Hat of Notch";
		invArmor[1].description="The hat owned by a really awesome indie dev.";
		invArmor[1].atype=1;
		invArmor[1].rating=2;
		//lumberjack shirt
		invArmor[2].name="Lumberjack Shirt";
		invArmor[2].description="The shirt of a lumberjack, all plaid, makes you feel like you can cut wood.";
		invArmor[2].atype=2;
		invArmor[2].rating=3;
		//retro shades
		invArmor[3].name="Retro Shades";
		invArmor[3].description="Some Old School shades.";
		invArmor[3].atype=6;
		invArmor[3].rating=2;
		
		//////food//////////
		//roll
		invFood[0].name="Roll";
		invFood[0].description="Just like any other roll.";
		invFood[0].healing=5;
		//water
		invFood[1].name="Bottled Water";
		invFood[1].description="The simplest thing that brings life and is neccesary for it.";
		invFood[1].healing=10;
		//candy
		invFood[2].name="Candy";
		invFood[2].description="The sweet deliciousness!";
		invFood[2].healing=1;
		//mountain crush (guess what)
		invFood[3].name="Mountain Crush";
		invFood[3].description="The one soda to rule them all.";
		invFood[3].healing=15;
		//soup
		invFood[4].name="Soup";
		invFood[4].description="A bowl of tasty soup.";
		invFood[4].healing=20;
		
	}
	
	public void addItem(String check){
		
		for(item k : invItem){
			String item = k.name.toLowerCase();
			if(item.equalsIgnoreCase(check)){
				itemInvento.add(k);
			}
		}
		
		for(armor k : invArmor){
			String item = k.name.toLowerCase();
			if(item.equalsIgnoreCase(check)){
				armorInvento.add(k);
			}
		}
		
		for(weapon k : invWeapon){
			String item = k.name.toLowerCase();
			if(item.equalsIgnoreCase(check)){
				weaponInvento.add(k);
			}
		}
		
		for(food k : invFood){
			String item = k.name;
			if(item.equalsIgnoreCase(check)){
				foodInvento.add(k);
			}
		}
		
		for(potion k : invPotion){
			String item = k.name.toLowerCase();
			if(item.equalsIgnoreCase(check)){
				potionInvento.add(k);
			}
		}
		
	}
	
	public void displayInv(){
		
		System.out.println("\n\nFood:");
		Iterator<food> f1 = foodInvento.iterator();
		while(f1.hasNext()){
			System.out.println(f1.next().name);
		}
		/*for(int i=0; i<foodInvento.size(); i++){
			
			System.out.println(foodInvento.get(i).name);
			
		}*/
		
		System.out.println("\n\nPotion:");
		for(int i=0; i<potionInvento.size(); i++){
			
			System.out.println(potionInvento.get(i).name);
			//System.out.println(foodInvento);
			
		}
		
		System.out.println("\n\nItem:");
		for(int i=0; i<itemInvento.size(); i++){
			
			System.out.println(itemInvento.get(i).name);
			//System.out.println(foodInvento);
			
		}
		
		System.out.println("\n\nArmor:");
		for(int i=0; i<armorInvento.size(); i++){
			
			System.out.printf("%s\n", armorInvento.get(i).name);
			//System.out.println(foodInvento);
			
		}
		
		System.out.println("\n\nWeapon:");
		for(int i=0; i<weaponInvento.size(); i++){
			
			System.out.println(weaponInvento.get(i).name);
			//System.out.println(foodInvento);
			
		}
		
	}
	
	public void removeItem(String check){
		
		for(int k=0; k < itemInvento.size(); k++){
			if(itemInvento.get(k).name.equalsIgnoreCase(check)){
				itemInvento.remove(k);
			}
		}
		
		for(int k=0; k < armorInvento.size(); k++){
			if(armorInvento.get(k).name.equalsIgnoreCase(check)){
				armorInvento.remove(k);
			}
		}
		
		for(int k=0; k < weaponInvento.size(); k++){
			if(weaponInvento.get(k).name.equalsIgnoreCase(check)){
				weaponInvento.remove(k);
			}
		}
		
		for(int k=0; k < foodInvento.size(); k++){
			if(foodInvento.get(k).name.equalsIgnoreCase(check)){
				foodInvento.remove(k);
			}
		}
		
		for(int k=0; k < potionInvento.size(); k++){
			if(potionInvento.get(k).name.equalsIgnoreCase(check)){
				potionInvento.remove(k);
			}
		}
		
	}
	
	public int checkItem(String check){
		
		int ck=1;
		
		for(int k=0; k < itemInvento.size(); k++){
			if(itemInvento.get(k).name.equalsIgnoreCase(check)){
				ck=0;
			}
		}
		
		for(int k=0; k < armorInvento.size(); k++){
			if(armorInvento.get(k).name.equalsIgnoreCase(check)){
				ck=0;
			}
		}
		
		for(int k=0; k < weaponInvento.size(); k++){
			if(weaponInvento.get(k).name.equalsIgnoreCase(check)){
				ck=0;
			}
		}
		
		for(int k=0; k < foodInvento.size(); k++){
			if(foodInvento.get(k).name.equalsIgnoreCase(check)){
				ck=0;
			}
		}
		
		for(int k=0; k < potionInvento.size(); k++){
			if(potionInvento.get(k).name.equalsIgnoreCase(check)){
				ck=0;
			}
		}
		
		return ck;
		
	}
	
}