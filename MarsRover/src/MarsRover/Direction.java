package MarsRover;

// Maps different directions
public enum Direction {

	N('W', 'E' ,0, -1), S('E', 'W',0,1), W('N', 'S',-1,0), E('N', 'S',1,0);

	private char left;
	private char right;
	private int xIncrementFactor;
	private int yIncrementFactor;

	Direction(char left, char right,int xIncrementFactor,int yIncrementFactor) {

		this.left = left;
		this.right = right;
		this.xIncrementFactor = xIncrementFactor;
		this.yIncrementFactor = yIncrementFactor;
	}

	public char getDirection(char direction) {
		if (direction == 'L') {
			return left;
		}
		return right;
	}

	public int getXFactor(){
		return xIncrementFactor;
	}
	public int getYFactor(){
		return yIncrementFactor;
	}
}