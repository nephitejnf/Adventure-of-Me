import java.util.Scanner;
import places.bedroom;
import java.util.*;
import javax.swing.JOptionPane;
import org.fusesource.jansi.*;
import org.fusesource.jansi.Ansi.Attribute;
import org.fusesource.jansi.Ansi.Color;

/********Bugfixes************\
-inventory not displaying
-font color reaching to the next color change
\****************************/
/********Additions***********\
-frontyard, garage areas, backyard
-wood shavings and gun powder items
-a dialog with a friend and game over screen
-note on the fridge
-you can read books, features Klingon
-added items (surprise you I will)
\****************************/
/*********Changes************\
-changed descriptions where needed to have the new areas.
-finished areas around the house
\****************************/


public class menuStart {
	
	public static void main(String[] args) {
		AnsiConsole.systemInstall();
		Ansi start = new Ansi();
		System.out.println(start.fg(Color.BLUE) + "\n\t\t\tThe Adventure of Me" + start.fg(Color.CYAN) + "\n\t\t\t\tInDev 1.5" + start.fg(Color.DEFAULT));
		System.out.println("\n\n\tPlease select an option (Type a number):\n\t" + start.fg(Color.BLUE) + "1" + start.fg(Color.DEFAULT) + ":\tStart Game\n\t" + start.fg(Color.BLUE) + "2" + start.fg(Color.DEFAULT) + ":\tQuit Game\n");
		Scanner input1 = new Scanner(System.in);
		String input = input1.nextLine();
		String option=((input.equals("1")) ?input:"0");
		if (option.equals("1")){
			//stats starter = new stats();
			//starter.play();
			bedroom br = new bedroom();
			br.desc();
		} else {
			System.out.println("Are you sure?");
		}
		
		
	}

}
