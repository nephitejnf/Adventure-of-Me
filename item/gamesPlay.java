package item;
import java.util.*;

import org.fusesource.jansi.Ansi.*;
import org.fusesource.jansi.*;

import places.functions.*;
import places.computer;

public class gamesPlay {
	
	Ansi as = new Ansi();
	public void whichGame(){
		
		System.out.println("What do you need to do on your flashdrive? (Numbers):\n\t" + as.fg(Color.BLUE) + "1" + as.fg(Color.DEFAULT) + ": Play Fortresscraft\n\t2: Leave");
		playing();
	}
	
	public void playing(){
		
		Scanner sc = new Scanner(System.in);
		
		if(sc.equals("1")){
			computerFunctions gf = new computerFunctions();
			gf.minecraft();
			whichGame();
		}else if(sc.equals("2")){
			computer co = new computer();
			co.desc();
		}else{
			whichGame();
		}
		
	}

}
