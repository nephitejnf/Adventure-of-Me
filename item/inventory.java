package item;

import java.awt.*;
import java.util.*;
import java.util.List;
import org.fusesource.jansi.*;
import org.fusesource.jansi.Ansi.Color;
import org.fusesource.jansi.Ansi.*;

public class inventory {
	
	public item invItem[]= {new item(), new item(), new item()};
	public armor invArmor[] = {new armor(), new armor(), new armor()};
	public weapon invWeapon[] = {new weapon(),};
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
		invItem[0].name=start.fg(Color.RED) + "Tin Can" + start.fg(Color.DEFAULT);
		invItem[0].description="A simple can made of aluminum.";
		//batteries
		invItem[1].name=start.fg(Color.RED) + "Batteries" + start.fg(Color.DEFAULT);
		invItem[1].description="They power things, enough said!";
		//bottle
		invItem[2].name=start.fg(Color.RED) + "Bottle" + start.fg(Color.DEFAULT);
		invItem[2].description="Empty bottle";
		
		//////armor///////////
		//settings for rags
		invArmor[0].name=start.fg(Color.RED) + "Simple Rags" + start.fg(Color.DEFAULT);
		invArmor[0].description="They are just rags, nothing special. Please don't where them.";
		//notch's hat
		invArmor[1].name=start.fg(Color.RED) + "Hat of Notch" + start.fg(Color.DEFAULT);
		invArmor[1].description="The hat owned by a really awesome developer.";
		invArmor[1].atype=1;
		invArmor[1].rating=2;
		//lumberjack shirt
		invArmor[2].name=start.fg(Color.RED) + "Lumberjack Shirt" + start.fg(Color.DEFAULT);
		invArmor[2].description="The shirt of a lumberjack, all plaid, makes you feel like you can cut wood.";
		invArmor[2].atype=2;
		invArmor[2].rating=3;
		
		//////food//////////
		//roll
		invFood[0].name=start.fg(Color.RED) + "Roll" + start.fg(Color.DEFAULT);
		invFood[0].description="Just like any other roll.";
		invFood[0].healing=5;
		//water
		invFood[1].name=start.fg(Color.RED) + "Bottled Water" + start.fg(Color.DEFAULT);
		invFood[1].description="The simplest thing that brings life and is neccesary for it.";
		invFood[1].healing=10;
		//candy
		invFood[2].name=start.fg(Color.RED) + "Candy" + start.fg(Color.DEFAULT);
		invFood[2].description="The sweet deliciousness!";
		invFood[2].healing=1;
		//mountain crush (guess what)
		invFood[3].name=start.fg(Color.RED) + "Mountain Crush" + start.fg(Color.DEFAULT);
		invFood[3].description="The one soda to rule them all.";
		invFood[3].healing=15;
		
	}
	
	public void addItem(String check){
		
		for(item k : invItem){
			if(k.name.equalsIgnoreCase(start.fg(Color.RED) + check + start.fg(Color.DEFAULT))){
				itemInvento.add(k);
			}
		}
		
		for(armor k : invArmor){
			if(k.name.equalsIgnoreCase(start.fg(Color.RED) + check + start.fg(Color.DEFAULT))){
				armorInvento.add(k);
			}
		}
		
		for(weapon k : invWeapon){
			if(k.name.equalsIgnoreCase(start.fg(Color.RED) + check + start.fg(Color.DEFAULT))){
				weaponInvento.add(k);
			}
		}
		
		for(food k : invFood){
			if(k.name.equalsIgnoreCase(start.fg(Color.RED) + check + start.fg(Color.DEFAULT))){
				foodInvento.add(k);
			}
		}
		
		for(potion k : invPotion){
			if(k.name.equalsIgnoreCase(start.fg(Color.RED) + check + start.fg(Color.DEFAULT))){
				potionInvento.add(k);
			}
		}
		
	}
	
	public void displayInv(){
		
		System.out.println("\n\nFood:");
		for(int i=0; i<=foodInvento.size()-1; i++){
			
			System.out.println(foodInvento.get(i).name);
			
		}
		
		System.out.println("\n\nPotion:");
		for(int i=0; i<=potionInvento.size()-1; i++){
			
			System.out.println(potionInvento.get(i).name);
			//System.out.println(foodInvento);
			
		}
		
		System.out.println("\n\nItem:");
		for(int i=0; i<=itemInvento.size()-1; i++){
			
			System.out.println(itemInvento.get(i).name);
			//System.out.println(foodInvento);
			
		}
		
		System.out.println("\n\nArmor:");
		for(int i=0; i<=armorInvento.size()-1; i++){
			
			System.out.println(armorInvento.get(i).name);
			//System.out.println(foodInvento);
			
		}
		
		System.out.println("\n\nWeapon:");
		for(int i=0; i<=weaponInvento.size()-1; i++){
			
			System.out.println(weaponInvento.get(i).name);
			//System.out.println(foodInvento);
			
		}
		
	}
	
	public void removeItem(String check){
		
		for(int k=0; k <= itemInvento.size()-1; k++){
			if(itemInvento.get(k).name.equalsIgnoreCase(start.fg(Color.RED) + check + start.fg(Color.DEFAULT))){
				itemInvento.remove(k);
			}
		}
		
		for(int k=0; k <= armorInvento.size()-1; k++){
			if(armorInvento.get(k).name.equalsIgnoreCase(start.fg(Color.RED) + check + start.fg(Color.DEFAULT))){
				armorInvento.remove(k);
			}
		}
		
		for(int k=0; k <= weaponInvento.size()-1; k++){
			if(weaponInvento.get(k).name.equalsIgnoreCase(start.fg(Color.RED) + check + start.fg(Color.DEFAULT))){
				weaponInvento.remove(k);
			}
		}
		
		for(int k=0; k <= foodInvento.size()-1; k++){
			if(foodInvento.get(k).name.equalsIgnoreCase(start.fg(Color.RED) + check + start.fg(Color.DEFAULT))){
				foodInvento.remove(k);
			}
		}
		
		for(int k=0; k <= potionInvento.size()-1; k++){
			if(potionInvento.get(k).name.equalsIgnoreCase(start.fg(Color.RED) + check + start.fg(Color.DEFAULT))){
				potionInvento.remove(k);
			}
		}
		
	}
	
	public int checkItem(String check){
		
		int ck=1;
		
		for(int k=0; k <= itemInvento.size()-1; k++){
			if(itemInvento.get(k).name.equalsIgnoreCase(check)){
				ck=0;
			}
		}
		
		for(int k=0; k <= armorInvento.size()-1; k++){
			if(armorInvento.get(k).name.equalsIgnoreCase(check)){
				ck=0;
			}
		}
		
		for(int k=0; k <= weaponInvento.size()-1; k++){
			if(weaponInvento.get(k).name.equalsIgnoreCase(check)){
				ck=0;
			}
		}
		
		for(int k=0; k <= foodInvento.size()-1; k++){
			if(foodInvento.get(k).name.equalsIgnoreCase(check)){
				ck=0;
			}
		}
		
		for(int k=0; k <= potionInvento.size()-1; k++){
			if(potionInvento.get(k).name.equalsIgnoreCase(check)){
				ck=0;
			}
		}
		
		return ck;
		
	}
	
}