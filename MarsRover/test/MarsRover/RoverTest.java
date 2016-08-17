package MarsRover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// Tests the Rover
public class RoverTest {

@Test
	public void shouldChangesDirectionFromNorthToWestIfDirectionIsLeft(){

	Rover rover=new Rover(1,2,Direction.N);
	assertEquals(rover.move('L'),new Rover(1,2,Direction.W));
}
@Test
	public void shouldChangesDirectionFromNorthToEastIfDirectionIsRight(){

	Rover rover=new Rover(1,2,Direction.N);
	assertEquals(rover.move('R'),new Rover(1,2,Direction.E));
}
@Test
	public void shouldChangesDirectionFromSouthToEastIfDirectionIsLeft(){

	Rover rover=new Rover(1,2,Direction.S);
	assertEquals(rover.move('L'),new Rover(1,2,Direction.E));
}
@Test
	public void shouldChangesDirectionFromWestToNorthIfDirectionIsRight(){

	Rover rover=new Rover(1,2,Direction.W);
	assertEquals(rover.move('R'),new Rover(1,2,Direction.N));
}
@Test
	public void shouldBeAbleToMoveTowardsNorth(){
	Rover rover=new Rover(1,2,Direction.N);
	assertEquals(rover.move('M'),new Rover(1,3,Direction.N));
}
@Test
	public void shouldBeAbleToMoveTowardsSouth(){
	Rover rover=new Rover(1,2,Direction.S);
	assertEquals(rover.move('M'),new Rover(1,1,Direction.S));
}


}
