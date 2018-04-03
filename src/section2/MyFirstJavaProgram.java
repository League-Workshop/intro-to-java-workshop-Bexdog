package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {
		// START HERE

		Robot Jeb = new Robot();
		Jeb.setSpeed(100);
		Jeb.setPenWidth(15);
		Jeb.penDown();
		for (int i = 0; i < 2; i++) {
			Jeb.setPenColor(Color.BLUE);
			Jeb.move(100);
			Jeb.turn(90);
			Jeb.setPenColor(Color.cyan);
			Jeb.move(200);
			Jeb.turn(90);
		}
	}
}
