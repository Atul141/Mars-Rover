package MarsRover;

import java.util.HashMap;
import java.util.Map;

// drives the entire application

	public class MarsRoverDriver {
	private Map<Character, Direction> mapOfDirections;
	private Coordinates coordinates;

	public Map<Character, Direction> getMapOfDirections() {
		mapOfDirections = new HashMap<>();
		mapOfDirections.put('N', Direction.N);
		mapOfDirections.put('W', Direction.W);
		mapOfDirections.put('E', Direction.E);
		mapOfDirections.put('S', Direction.S);
		return mapOfDirections;
	}

	public void moveRover(char[] directions, Rover rover) {
		for (char direction : directions) {
			rover = rover.move(direction);
			coordinates = rover.getCurrentPosition();
		}
		System.out.println(coordinates.getxCoordinates() + "  " + coordinates.getyCoordinates() + " " + coordinates.getDirection());

	}
}
