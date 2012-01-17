import java.util.*;

import places.bedroom;
import places.places;

public class stats {
	
	public static int strength, defence, mp, hp, maxmp, maxhp, perception, dexterity, wisdom, charisma, intiative, speed;
	public static String name;
	
	
	public void play() {
		System.out.println("\tHello welcome to the game!\nHere we will be choosing your stats and then moving on to deciding your features.");
		System.out.println("\nWhat is your name?");
		
		for (int ready1=0; ready1==0;){
			
			Scanner scan = new Scanner(System.in);
			name = scan.nextLine();
			
			System.out.println("Are you sure you wish to be called " + name + "? (\'yes\' or \'no\')");
			Scanner ready2 = new Scanner(System.in);
			ready1=((ready2.nextLine().equals("yes")) ?1:0);
		}
		
		for (int stop2=0; stop2==0;){
			getStats();
			customizeStats();
			showStats();
			System.out.println("Are you ready to continue?");
			Scanner stopper = new Scanner(System.in);
			String stop1 = stopper.nextLine();
			stop2=((stop1.equalsIgnoreCase("yes")) ?1:0);
		}
		
		//places go1 = new places();
		places go = new bedroom();
		go.desc();


	}
	
	private static void getStats(){
		Random rand = new Random();
		strength = rand.nextInt(10);
		defence = rand.nextInt(10);
		mp = rand.nextInt(15);
		maxmp = mp;
		hp = rand.nextInt(20);
		maxhp = hp;
		perception = rand.nextInt(8);
		dexterity = rand.nextInt(8);
		wisdom = rand.nextInt(6);
		charisma = rand.nextInt(6);
		intiative = rand.nextInt(20);
		speed = rand.nextInt(6);
		
		
	}
	
	private static void showStats(){
		System.out.println("\n\t\t" + name +", your stats are:");
		System.out.println("\tStrength:\t" + strength);
		System.out.println("\tDefence:\t" + defence);
		System.out.println("\tHealth:\t\t" + hp + "/" + maxhp);
		System.out.println("\tMana:\t\t" + mp + "/" + maxmp);
		System.out.println("\tInitiative:\t" + intiative);
		System.out.println("\tPerception:\t" + perception);
		System.out.println("\tWisdom:\t\t" + wisdom);
		System.out.println("\tCharisma:\t" + charisma);
		System.out.println("\tSpeed:\t\t" + speed);
		System.out.println("\tDexterity:\t" + dexterity);
		
	}
	
	private static void customizeStats(){
		
		Random number = new Random();
		
		for(int checkAdd = number.nextInt(10) + 1; checkAdd!=0; checkAdd--){
			System.out.println("\n\t\tAdd 1 point where?");
			System.out.println("\n\t1:\tStrength:\t" + strength);
			System.out.println("\n\t2:\tDefence:\t" + defence);
			System.out.println("\n\t3:\tInitiative:\t" + intiative);
			System.out.println("\n\t4:\tPerception:\t" + perception);
			System.out.println("\n\t5:\tWisdom:\t\t" + wisdom);
			System.out.println("\n\t6:\tCharisma:\t" + charisma);
			System.out.println("\n\t7:\tSpeed:\t\t" + speed);
			System.out.println("\n\t8:\tDexterity:\t" + dexterity);
			System.out.println("\n\n\t\tPoints available:\t" + checkAdd);
			
			Scanner where = new Scanner(System.in);
			switch(where.nextInt()){
			case 1:
				strength += 1;
				break;
			case 2:
				defence += 1;
				break;
			case 3:
				intiative += 1;
				break;
			case 4:
				perception += 1;
				break;
			case 5:
				wisdom += 1;
				break;
			case 6:
				charisma += 1;
				break;
			case 7:
				speed += 1;
				break;
			case 8:
				dexterity += 1;
				break;
			default:
				System.out.println("Oops, INVALID!");
			}
		}
		
	}

}
