package controller;

import domain.Plateau;
import domain.Rover;

public class PositionController {
	private Plateau plateau;
	private Rover rover;

	public PositionController(int h, int w, int x, int y, char direction) {
		this.plateau = new Plateau(h, w);
		this.rover = new Rover(x, y, direction);
	}

	public Plateau getPlateau() {
		return plateau;
	}

	public void setPlateau(Plateau plateau) {
		this.plateau = plateau;
	}

	public Rover getRover() {
		return rover;
	}

	public void setRover(Rover rover) {
		this.rover = rover;
	}

	public void sendInstruction(char instruction) {
		switch (instruction) {
		case 'M':
			rover.move();
			break;
		case 'L':
		case 'R':
			rover.rotate(instruction);
			break;
		default:
			break;

		}
	}
}
