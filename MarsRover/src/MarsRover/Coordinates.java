package MarsRover;

// Represents a single cell
public class Coordinates {

	private int xCoordinates;
	private int yCoordinates;

	public Coordinates(int xCoordinates, int yCoordinates){

		this.xCoordinates = xCoordinates;
		this.yCoordinates = yCoordinates;
	}
	public int getxCoordinates(){
		return xCoordinates;
	}
	public int getyCoordinates(){
		return yCoordinates;
	}

}
