package MarsRover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// Tests the Rover
public class RoverTest {

@Test
	public void shouldChangesDirectionFromNorthToWestIfDirectionIsLeft() throws OutSideGrid {

	Rover rover=new Rover(1,2,Direction.N);
	assertEquals(rover.move('L',new Grid(3,3)),new Rover(1,2,Direction.W));
}
@Test
	public void shouldChangesDirectionFromNorthToEastIfDirectionIsRight() throws OutSideGrid {

	Rover rover=new Rover(1,2,Direction.N);
	assertEquals(rover.move('R',new Grid(3,3)),new Rover(1,2,Direction.E));
}
@Test
	public void shouldChangesDirectionFromSouthToEastIfDirectionIsLeft() throws OutSideGrid {

	Rover rover=new Rover(1,2,Direction.S);
	assertEquals(rover.move('L',new Grid(3,3)),new Rover(1,2,Direction.E));
}
@Test
	public void shouldChangesDirectionFromWestToNorthIfDirectionIsRight() throws OutSideGrid {

	Rover rover=new Rover(1,2,Direction.W);
	assertEquals(rover.move('R',new Grid(3,3)),new Rover(1,2,Direction.N));
}
@Test
	public void shouldBeAbleToMoveTowardsNorth() throws OutSideGrid {
	Rover rover=new Rover(1,2,Direction.N);
	assertEquals(rover.move('M',new Grid(4,4)),new Rover(1,3,Direction.N));
}
@Test
	public void shouldBeAbleToMoveTowardsSouth() throws OutSideGrid {
	Rover rover=new Rover(1,2,Direction.S);
	assertEquals(rover.move('M',new Grid(3,3)),new Rover(1,1,Direction.S));
}


}
