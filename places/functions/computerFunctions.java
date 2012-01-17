package places.functions;
import java.util.*;

public class computerFunctions {
	
	public void minecraft(){
		
		String mineActions[] = {"You start a new game and kill loads of creepers.", "You build a massive castle.", "You tend to your farm.", "You explore the caves and find hardly anything except for creepers.", "You explore the caves and find loads of diamonds."};
		Random test = new Random();
		int i = test.nextInt(mineActions.length);
		System.out.println(mineActions[i]);
		
	}
	
	public void homework(){
		
		String homeActions[] = {"You read a book for English.", "You work on a book report.", "You do some math.", "You work on science.", "You do some research on the internet for a paper."};
		Random test = new Random();
		int i = test.nextInt(homeActions.length);
		System.out.println(homeActions[i]);
		
	}
	
	public void browseWeb(){
		
		String webActions[] = {"You go check out LOLCats.", "Gogle helps you find crap.", "Playing flash games."};
		Random test = new Random();
		int i = test.nextInt(webActions.length);
		System.out.println(webActions[i]);
		
	}

}
