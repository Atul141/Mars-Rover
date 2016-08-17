package MarsRover;

// Represents a single cell
public class Position {

	private int xCoordinates;
	private int yCoordinates;

	public Position(int xCoordinates, int yCoordinates){

		this.xCoordinates = xCoordinates;
		this.yCoordinates = yCoordinates;
	}

	@Override
	public String toString() {
		return xCoordinates +
			" "	 + yCoordinates;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Position cell = (Position) o;

		if (xCoordinates != cell.xCoordinates) return false;
		return yCoordinates == cell.yCoordinates;

	}

	@Override
	public int hashCode() {
		int result = xCoordinates;
		result = 31 * result + yCoordinates;
		return result;
	}
}
