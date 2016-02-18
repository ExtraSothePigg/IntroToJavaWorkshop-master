package day5;



import java.awt.JobAttributes;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.ImageBackground;
import org.teachingextensions.logo.Paintable;
import org.teachingextensions.logo.Tortoise;

/** Note: You will need the latest version of the TKP jar: http://school.wintrisstech.org/jars/TeachingKidsProgramming.jar **/

public class TreasureHunt implements KeyEventDispatcher {

	int tortoiseSpeed = 5;

	private void goUp() {
		// 1. Make the tortoise move up the screen
		Tortoise.setAngle(0);
Tortoise.move(10);
	}

	private void goDown() {
		// 2. make the tortoise move down the screen
Tortoise.setAngle(180);
Tortoise.move(10);
	}

	private void goLeft() {
		// 3. make the tortoise move left (3 lines of code)
		// Hint: the turn() method lags more than setAngle()
Tortoise.setAngle(-90);
Tortoise.move(10);
	
	
	}

	private void goRight() {
		// 4. make the tortoise move right
		
		Tortoise.setAngle(90);
		Tortoise.move(10);
	}

	private void spaceBarWasPressed() {
		int tortoiseLocationX = Tortoise.getX();
		int tortoiseLocationY = Tortoise.getY();

		// 5. Print out the variables for tortoiseLocationX and tortoiseLocationY
System.out.println("x = "+tortoiseLocationX+", y = "+tortoiseLocationY);

	
// 6. If tortoise is at same location as the little girl,
		// 			make a pop-up tell the Tortoise where to go next
if (tortoiseLocationX == 500&&tortoiseLocationY == 300) {
	
	JOptionPane.showMessageDialog(null,"Go to that kid with the dynamite.");
	
}
		// 7. Give the user subsequent clues at different locations on the image
		// (pirate robot, swamp, parrots, etc.)
String WhatHeWants;
if(tortoiseLocationX == 140&&tortoiseLocationY == 290){
WhatHeWants = JOptionPane.showInputDialog("Wuddea want?");

if (WhatHeWants.equals("treasure")) {
	JOptionPane.showMessageDialog(null, "...");
	JOptionPane.showMessageDialog(null, "So you want the treasure...");
	JOptionPane.showMessageDialog(null, "well, I'm not just gonna give it to you.");
	JOptionPane.showMessageDialog(null, "Here's a hint, though:");
	JOptionPane.showMessageDialog(null, "There's a guy inside the eye of the skull.");

} else {
	
	JOptionPane.showMessageDialog(null, "Well then. I'm not sure why you came to me.");

}
}
if (tortoiseLocationX == 140 && tortoiseLocationY == 40){
	
	JOptionPane.showMessageDialog(null, "WUDDUWANT?");
	JOptionPane.showMessageDialog(null, "Oh.");
	JOptionPane.showMessageDialog(null, "Well... YOU'RE NOT FINDING IT HERE!");
	JOptionPane.showMessageDialog(null, "There's another skull on this 'island.'");
	JOptionPane.showMessageDialog(null, "...And I'm NOT HELPING YOU FIND IT!");
	JOptionPane.showMessageDialog(null, "I'm such an evil person.");
	JOptionPane.showMessageDialog(null, "MWAHAHAHAHAHAHAHAAAAAAAAaaa...");
	JOptionPane.showMessageDialog(null, "Ha.");
}

if(tortoiseLocationX == 400 && tortoiseLocationY == 240){
	
	JOptionPane.showMessageDialog(null, "How'd you manage to figure that out...?");
	JOptionPane.showMessageDialog(null, "I mean... Wow! You found me! I'm the tiny man in the eye of the tiny skull!");
	JOptionPane.showMessageDialog(null, "I already know you're looking for treasure.");
	JOptionPane.showMessageDialog(null, "It seems you need another clue.");
	JOptionPane.showMessageDialog(null, "Here's the clue: It's a song by Sting. The song has a message in it.");
	JOptionPane.showMessageDialog(null, "Yeah, have fun figuring that one out, but it's the final clue.");

}
if(tortoiseLocationX == 290 && tortoiseLocationY == 380){
	
	JOptionPane.showMessageDialog(null, "WAIT NO I DON'T HAVE TIME TO FINISH!");
	JOptionPane.showMessageDialog(null, "*The message in a bottle implodes, vanishing in a split second*");
	JOptionPane.showMessageDialog(null, "*You suddenly realize that that bottle had the treasure in it.*");
	JOptionPane.showMessageDialog(null, "*Unable to get the treasure anymore, you implode as well.*");
	JOptionPane.showMessageDialog(null, "You win? I guess? I mean, you didn't really win...");
	
}

	}
	private void go() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		/*
		 * If you want to use your own background, download the image you want, and change the following line to point to it like: new
		 * ImageBackground("file:/Users/joonspoon/Desktop/dinosaurLand.jpg");
		 */
		Paintable backgroundImage = new ImageBackground("file:/Users/League/Google Drive/league-images/treasure_hunt.jpg");
		Tortoise.getBackgroundWindow().addPaintable(backgroundImage);
		Tortoise.penUp();
		JOptionPane.showMessageDialog(null, "Ask the little girl for help with your quest. Press the space bar to ask.");
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			else if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			else if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			else if (e.getKeyCode() == KeyEvent.VK_DOWN)
				goDown();
			else if (e.getKeyCode() == KeyEvent.VK_SPACE)
				spaceBarWasPressed();
		}
		return false;
	}

	public static void main(String[] args) throws MalformedURLException {
		new TreasureHunt().go();
	}
}


