package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) throws InterruptedException {
		
		// START HERE
Robot Chas = new Robot ("batman");
	
Chas.penDown();
Chas.setSpeed(10);
		for (int i = 0; i < 1000; i++) {
			
			Chas.setRandomPenColor();
			Chas.turn(127);
			Chas.move(100);
			
	
		}
	}
}
