package MarsRover;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

// Tests the Rover
public class RoverTest {

@Test
	public void shouldBeAbleToVerifyIfROverChangesDirection(){

	Rover rover=new Rover(1,2,Direction.N);
	assertEquals(rover.getNextDirection('L'),'W');
}
@Test
	public void shouldBeAbleToMove(){
	Rover rover=new Rover(1,2,Direction.N);
	assertArrayEquals(rover.getNextDirection('M'),);
}
}
