package MarsRover;

// Tests Grid
public class Grid {

	private int maxXCoordinate;
	private int maxYCoordinate;

	public Grid(int maxXCoordinate, int maxYCoordinate){

		this.maxXCoordinate = maxXCoordinate;
		this.maxYCoordinate = maxYCoordinate;
	}


	public boolean checkIfInsideGrid(int xCoordinate, int yCoordinate) {
		return xCoordinate<maxXCoordinate&&yCoordinate<maxYCoordinate;
	}
}
