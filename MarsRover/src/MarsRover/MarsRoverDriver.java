package MarsRover;

import java.util.HashMap;
import java.util.Map;

// drives the entire application
public class MarsRoverDriver {
	Map<Character,Direction> mapOfDirections;
	public Map<Character,Direction> getMapOfDirections(){
		 mapOfDirections= new HashMap<>();
		mapOfDirections.put('N',Direction.N);
		mapOfDirections.put('W',Direction.W);
		mapOfDirections.put('E',Direction.E);
		mapOfDirections.put('S',Direction.S);
		//Rover rover=new Rover(1,2,mapOfDirections.get('W'),mapOfDirections);
	return mapOfDirections;
	}
}
