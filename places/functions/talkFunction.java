package places.functions;

import java.util.Scanner;
import org.fusesource.jansi.*;
import org.fusesource.jansi.Ansi.Color;

public class talkFunction {
		
	boolean flash = false;
	boolean crush = false;
	
	public void personCheck(String who){
		
		if(who.equals("frontHouseFriend")){
			System.out.println("\nHey, how ya doing? Ready to go?");
			frontHouseFriend();
		}
		
	}
	
	private void frontHouseFriend(){
		
		gameOver go = new gameOver();
		Scanner check = new Scanner(System.in);
		Ansi cl = new Ansi();
		
		System.out.println("\n\t" + cl.fg(Color.BLUE) + "1" + cl.fg(Color.DEFAULT) + ": Not quite\n\t" + cl.fg(Color.BLUE) + "2" + cl.fg(Color.DEFAULT) + ": I'm not going\n\t" + cl.fg(Color.BLUE) + "3" + cl.fg(Color.DEFAULT) + ": Let's go!");
		
		int checker = check.nextInt();
		switch(checker){
			case(1):
				System.out.println("\nWhat do you need?\n\t" + cl.fg(Color.BLUE) + "1" + cl.fg(Color.DEFAULT) + ": Flash drive\n\t" + cl.fg(Color.BLUE) + "2" + cl.fg(Color.DEFAULT) + ": Mountain Crush\n\t" + cl.fg(Color.BLUE) + "3" + cl.fg(Color.DEFAULT) + ": Nothing");
					checker = check.nextInt();
					switch(checker){
						case(1):
							System.out.println("\nYou quickly find your flash drive in your closet and head back out.\n\nAnything else?\n\t" + cl.fg(Color.BLUE) + "1" + cl.fg(Color.DEFAULT) + ": Nope, let's go\n\t" + cl.fg(Color.BLUE) + "2" + cl.fg(Color.DEFAULT) + ": It feels like something is missing.");
							flash = true;
							checker = check.nextInt();
							switch(checker){
								case(1):
									System.out.println("\nYou two head off to school.");
									break;
								case(2):
									System.out.println("\nIs it the Mountain Crush?\n\t" + cl.fg(Color.BLUE) + "1" + cl.fg(Color.DEFAULT) + ": No, let's go!\n\t" + cl.fg(Color.BLUE) + "2" + cl.fg(Color.DEFAULT) + ": Oh, yeah, of course!");
									checker = check.nextInt();
									switch(checker){
										case(1):
											System.out.println("You head off to school without your luschious drink.");
											break;
										case(2):
											System.out.println("You quickly grab your twelve pack from the fridge and head to school.");
											break;
									}
									break;
								default:
									System.out.println("ERROR");
									break;
							}
							break;
						case(2):
							System.out.println("\nYou get in the fridge and take out your twelve pack of Mountain Crush.\n\nIs there anything else, I think you are fully preped now.\n\t" + cl.fg(Color.BLUE) + "1" + cl.fg(Color.DEFAULT) + ": Nope, got everything I need.\n\t" + cl.fg(Color.BLUE) + "2" + cl.fg(Color.DEFAULT) + ": Feels like something is missing.");
							crush = true;
							checker = check.nextInt();
							switch(checker){
								case(1):
									System.out.println("\nYou two head off.");
									break;
								case(2):
									System.out.println("\nYou suddenly remember your flash drive and go dig through your closet to get it.\nYou head back out and go to school.");
									break;
							}
							break;
						case(3):
							System.out.println("\nThen what are you waiting for?\n\t" + cl.fg(Color.BLUE) + "1" + cl.fg(Color.DEFAULT) + ": Some...thing?\n\t" + cl.fg(Color.BLUE) + "2" + cl.fg(Color.DEFAULT) + ": Let's go.");
							checker = check.nextInt();
							switch(checker){
								case(1):
									System.out.println("\nOk, see ya.");
									go.gamePrint();
									break;
								case(2):
									System.out.println("\n\nYou get on your way to school.");
									break;
								default:
									System.out.println("ERROR");
									break;
							}
							break;
						default:
							System.out.println("ERROR");
							break;
					}
				break;
			case(2):
				System.out.println("\nWhat, why not?\n\t" + cl.fg(Color.BLUE) + "1" + cl.fg(Color.DEFAULT) + ": I...am not feeling well.\n\t" + cl.fg(Color.BLUE) + "2" + cl.fg(Color.DEFAULT) + ": The...doctor needs to see me.\n\t" + cl.fg(Color.BLUE) + "3" + cl.fg(Color.DEFAULT) + ": The new Ring Planet game came out today, gotta get through the campaign today.\n\t" + cl.fg(Color.BLUE) + "4" + cl.fg(Color.DEFAULT) + ": I...well...excuse...don't have a good one.");
				checker = check.nextInt();
				switch(checker){
					case(1):
						System.out.println("\nThen why are you out here?\n\t" + cl.fg(Color.BLUE) + "1" + cl.fg(Color.DEFAULT) + ": I...saw you out and had to tell you.\n\t" + cl.fg(Color.BLUE) + "2" + cl.fg(Color.DEFAULT) + ": I'm ok, let's go.");
							checker = check.nextInt();
							switch(checker){
								case(1):
									System.out.println("\nOk then, see ya later.");
									go.gamePrint();
									break;
								case(2):
									System.out.println("\nI thought so.\nYou two head to school.");
									break;
								default:
									System.out.println("ERROR");
									break;
							}
						break;
					case(2):
						System.out.println("\nHave a nice day at the doctor's then.");
						go.gamePrint();
						break;
					case(3):
						System.out.println("\n*facepalms* Then have a nice day catching up on homework, and don't you have a lab today?\n\t" + cl.fg(Color.BLUE) + "1" + cl.fg(Color.DEFAULT) + ": Ok, see ya\n\t" + cl.fg(Color.BLUE) + "2" + cl.fg(Color.DEFAULT) + ": I'm coming");
						checker = check.nextInt();
						switch(checker){
							case(1):
								System.out.println("\nI hope you don't miss out, bye.");
								go.gamePrint();
								break;
							case(2):
								System.out.println("\nI thought I could convince you!");
								break;
						}
						break;
					case(4):
						System.out.println("\nWell then, get your stuff and lets go!\nOff you go!");
						break;
					default:
						System.out.println("ERROR");
						break;
				}
				break;
			case(3):
				System.out.println("\nGlad to see you happy to go!\n\nYou two get on your way to school.");
				break;
			default:
				System.out.println("ERROR");
				break;
		}
		
		//object to school
		
	}

}
