package MarsRover;

// Represents a Rover

import java.util.Map;

public class Rover {

	private Direction direction;
	private Coordinates coordinates;
	private Map<Character, Direction> mapOfDirections;

	public Rover(int xCoordinates, int yCoordinates, Direction direction) {
		coordinates = new Coordinates(xCoordinates, yCoordinates);
		this.direction = direction;
		mapOfDirections = new MarsRoverDriver().getMapOfDirections();
	}

	public Rover move(char side) {
		if (side == 'M') {
			return new Rover(coordinates.getxCoordinates() + direction.getXFactor(), coordinates.getyCoordinates() + direction.getYFactor(), direction);
		}
		System.out.println(direction.getDirection(side));
		return new Rover(coordinates.getxCoordinates(), coordinates.getyCoordinates(), mapOfDirections.get(direction.getDirection(side)));

	}

	public Coordinates getCurrentPosition() {
		return coordinates;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Rover rover = (Rover) o;

		if (direction != rover.direction) return false;
		return mapOfDirections != null ? mapOfDirections.equals(rover.mapOfDirections) : rover.mapOfDirections == null;

	}

	@Override
	public int hashCode() {
		int result = direction != null ? direction.hashCode() : 0;
		result += coordinates.getxCoordinates() * 3 + coordinates.getyCoordinates() * 5;
		return result;
	}
}
