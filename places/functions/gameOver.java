package places.functions;

import org.fusesource.jansi.*;
import org.fusesource.jansi.Ansi.Color;

public class gameOver {
	
	public void gamePrint(){
		Ansi fon = new Ansi();
		System.out.println(fon.fg(Color.RED).bg(Color.YELLOW) + "GAME OVER");
		System.exit(0);
	}
	
}
