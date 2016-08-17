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

	public void moveRover(char[] directions, Rover rover,Grid grid) throws OutSideGrid {
		try {
			for (char direction : directions) {
				rover = rover.move(direction, grid);
				coordinates = rover.getCurrentPosition();
			}
		}catch (OutSideGrid e){
			System.out.println("Rover trying to go outside the grid");
		}
		System.out.println(coordinates.getxCoordinates() + "  " + coordinates.getyCoordinates() + " " + coordinates.getDirection());

	}
}
