package domain;

public class Rover {
	private int x;
	private int y;
	private char direction;

	public Rover(int x, int y, char direction) {
		super();
		this.x = x;
		this.y = y;
		this.direction = direction;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public char getDirection() {
		return direction;
	}

	public void setDirection(char direction) {
		this.direction = direction;
	}

	@Override
	public String toString() {
		return x + " " + y + " " + direction;
	}

	public void move() {
		switch (direction) {
		case 'N':
			y++;
			break;
		case 'S':
			y--;
			break;
		case 'E':
			x++;
			break;
		case 'W':
			x--;
			break;
		default:
			break;
		}

	}

	public void rotate(char instruction) {
		if(instruction == 'L'){
			switch (direction) {
			case 'N':
				setDirection('W');
				break;
			case 'S':
				setDirection('E');
				break;
			case 'E':
				setDirection('N');
				break;
			case 'W':
				setDirection('S');
				break;
			default:
				break;
			}
		}
		else if(instruction == 'R'){
			switch (direction) {
			case 'N':
				setDirection('E');
				break;
			case 'S':
				setDirection('W');
				break;
			case 'E':
				setDirection('S');
				break;
			case 'W':
				setDirection('N');
				break;
			default:
				break;
			}
		}

	}

}
