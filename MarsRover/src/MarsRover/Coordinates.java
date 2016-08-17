package MarsRover;

// Represents a single cell
public class Coordinates {

	private int xCoordinates;
	private int yCoordinates;
	private Direction direction;

	public Coordinates(int xCoordinates, int yCoordinates,Direction direction){

		this.xCoordinates = xCoordinates;
		this.yCoordinates = yCoordinates;
		this.direction = direction;
	}
	public int getxCoordinates(){
		return xCoordinates;
	}
	public int getyCoordinates(){
		return yCoordinates;
	}
	public Direction getDirection(){
		return direction;
	}
}
