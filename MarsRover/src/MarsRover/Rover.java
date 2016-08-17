package MarsRover;

// Represents a Rover

public class Rover {

	private int xCoordinates;
	private int yCoordinates;
	private Direction direction;

	public Rover(int xCoordinates, int yCoordinates, Direction direction) {
		this.xCoordinates = xCoordinates;
		this.yCoordinates = yCoordinates;
		this.direction = direction;
	}

	public char findNewDirection(char side) {
		if (side == 'M') {
			char currentDirection = direction.getDirection(side);
			return currentDirection;
		} else move(side);
		return ' ';

	}
	public void move(char side){

	//	Rover rover=new Rover(xCoordinates+direction.getXFactor(),yCoordinates+direction.getYFactor(),findNewDirection(side));

	}
}
