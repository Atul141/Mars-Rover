package MarsRover;

// Represents a Rover

import java.util.Map;

public class Rover {

	private Direction direction;
	private Coordinates coordinates;
	private Map<Character,Direction> mapOfDirections;
	public Rover(int xCoordinates, int yCoordinates, Direction direction) {
		coordinates =new Coordinates(xCoordinates,yCoordinates);
		this.direction = direction;
	mapOfDirections=new MarsRoverDriver().getMapOfDirections();
	}


	public char getNextDirection(char side) {
		if (side == 'M') {
			char currentDirection = direction.getDirection(side);
			return currentDirection;
		} else move(side);
		return ' ';

	}
	public void move(char side){

		Rover rover=new Rover(coordinates.getxCoordinates()+direction.getXFactor(),coordinates.getyCoordinates()+direction.getYFactor(),mapOfDirections.get(side));

	}
	public Coordinates getCurrentPosition(){
		return coordinates;
	}
}
