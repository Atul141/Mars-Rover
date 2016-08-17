package MarsRover;

import java.util.Map;

// Contains main method
public class Main {

	public static void main(String[] args) throws OutSideGrid {
		MarsRoverDriver driver=new MarsRoverDriver();
		Map<Character,Direction> mapOfDirections=driver.getMapOfDirections();
		Grid grid=new Grid(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		char[] mapDirection=args[4].toCharArray();
		Rover rover = new Rover(Integer.parseInt(args[2]), Integer.parseInt(args[3]),mapOfDirections.get(mapDirection[0]));
		char[] directions = args[5].toCharArray();
		driver.moveRover(directions,rover,grid);

	}
}