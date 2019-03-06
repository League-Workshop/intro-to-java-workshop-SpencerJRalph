package section2;

import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	Robot hi = new Robot();

	void go() {
		hi.setSpeed(400);
		hi.penDown();
		for (int i = 0; i < 4; i++) {
			hi.setRandomPenColor();
			hi.setPenWidth(5);
		}

		// 1. Call the drawSquare() method
		drawSquare();
		// 8. Turn the robot 90 degrees to the right

	}

	void drawSquare() {
		// JOptionPane.showMessageDialog(null, "yay! you called the drawSquare()
		// method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		for (int i = 0; i < 4; i++) {
			hi.move(100);
			hi.turn(90);

		}
	}

	public static void main(String[] args) {
		new FourSquare().go();

	}
}
