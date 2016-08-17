package MarsRover;

// Represents a Rover

import java.util.Map;

public class Rover {

//	private Direction direction;
	private Coordinates coordinates;
	private Map<Character, Direction> mapOfDirections;

	public Rover(int xCoordinates, int yCoordinates, Direction direction) {
		coordinates = new Coordinates(xCoordinates, yCoordinates,direction);
		mapOfDirections = new MarsRoverDriver().getMapOfDirections();
	}

	public Rover move(char side) {
		if (side == 'M') {
			return new Rover(coordinates.getxCoordinates() + coordinates.getDirection().getXFactor(), coordinates.getyCoordinates() + coordinates.getDirection().getYFactor(),coordinates.getDirection());
		}
		return new Rover(coordinates.getxCoordinates(), coordinates.getyCoordinates(), mapOfDirections.get(coordinates.getDirection().getDirection(side)));

	}

	public Coordinates getCurrentPosition() {
		return coordinates;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Rover rover = (Rover) o;

		if (coordinates.getDirection()!= rover.coordinates.getDirection()) return false;
		return mapOfDirections != null ? mapOfDirections.equals(rover.mapOfDirections) : rover.mapOfDirections == null;

	}

	@Override
	public int hashCode() {
		int result = coordinates.getDirection() != null ? coordinates.getDirection().hashCode() : 0;
		result += coordinates.getxCoordinates() * 3 + coordinates.getyCoordinates() * 5;
		return result;
	}
}
