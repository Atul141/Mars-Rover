package MarsRover;

import org.junit.Assert;
import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

// Tests Grid Class
public class GridTest {

@Test
	public void shouldBeABleCheckIfROverIsInsideTheGrid(){
	Grid grid=new Grid(4,4);
	assertTrue(grid.checkIfInsideGrid(3,3));
}
@Test
	public void shouldReturnFalseIfRoverISOutside(){
	Grid grid=new Grid(4,4);
	assertFalse(grid.checkIfInsideGrid(5,5));
}
}
