import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;


public class UtilsTest {

	@Test
	public void testSortedArray() {
		assertEquals(Arrays.asList(1,2,3,4,5,6), Utils.sort(Arrays.asList(5,4,3,2,1,6)));
		assertEquals(Arrays.asList(1,4,5,6), Utils.sort(Arrays.asList(5,4,1,6)));
		assertEquals(Arrays.asList(1,1,1,4,5,6,111), Utils.sort(Arrays.asList(1,5,4,1,111,1,6)));
	}

	@Test
	public void testReversedArray(){
		ArrayList<Integer> array = new ArrayList<Integer>();
		for (int i = 0; i < 5; i++) {
			array.add(i);			
		}
		ArrayList<Integer> reversed = new ArrayList<Integer>();
		for (int i = 4; i >= 0; i--) {
			reversed.add(i);
		}
		assertEquals(reversed, Utils.reverse(array));
		List<Integer> reversedArray = (ArrayList<Integer>) Utils.reverse(array);
		assertFalse(array.equals(reversedArray));
	}

	@Test
	public void testIsMonotonous(){
		assertTrue(Utils.isMonotonous(Arrays.asList(1,2,3,4,5,6)));
		assertTrue(Utils.isMonotonous(Arrays.asList(6,5,4,3,2,1,1,1)));
		assertFalse(Utils.isMonotonous(Arrays.asList(1,2,1,4,5,4)));
		assertTrue(Utils.isMonotonous(Arrays.asList(1,1,1)));
	}

}
