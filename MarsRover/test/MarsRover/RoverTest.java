package MarsRover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

// Tests the Rover
public class RoverTest {

@Test
	public void shouldBeAbleToVerifyIfROverChangesDirection(){

	Rover rover=new Rover(1,2,Direction.N);
	assertEquals(rover.move('L'),new Rover(1,2,Direction.W));
}
@Test
	public void shouldBeAbleToMove(){
	Rover rover=new Rover(1,2,Direction.N);
	assertEquals(rover.move('M'),new Rover(1,3,Direction.N));
}


}
