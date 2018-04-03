package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class BK {

	public static void main(String[] args) {
		Robot bk = new Robot();
		bk.setSpeed(100);
		bk.hide();
		bk.setRandomPenColor();
		bk.penDown();
		bk.move(100);
		bk.turn(90);
		bk.move(45);
		bk.turn(90);
		bk.move(40);
		bk.turn(45);
		bk.move(15);
		bk.turn(45);
		bk.move(34);
		bk.move(-34);
		bk.turn(45 * 5);
		bk.move(15);
		bk.turn(45);
		bk.move(40);
		bk.turn(90);
		bk.move(45);
		bk.turn(180);
		bk.penUp();
		bk.move(88);
		bk.setPenWidth(10);
		bk.setPenColor(Color.BLACK);
		bk.penDown();
		bk.move(1);
		bk.penUp();
		bk.setPenWidth(1);
		bk.move(58);
		bk.penDown();
		bk.setRandomPenColor();
		bk.turn(-90);
		bk.move(100);
		bk.turn(180);
		bk.move(50);
		bk.turn(45 * 5);
		bk.move(60);
		bk.turn(180);
		bk.move(60);
		bk.turn(45 * 6);
		bk.move(60);
		bk.penUp();
		bk.turn(-45);
		bk.move(72);
		bk.setPenWidth(10);
		bk.setPenColor(Color.BLACK);
		bk.penDown();
		bk.move(1);
	}

}
