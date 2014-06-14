import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class UtilsTest {
	private Utils ms;

	@Before
	public void setUp() throws Exception {
		ms = new Utils();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSortedArray() {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(2);
		array.add(1);
		array.add(3);
		array.add(5);
		array.add(4);
		ArrayList<Integer> sorted = new ArrayList<Integer>();
		for (int i = 1; i < 6; i++) {
			sorted.add(i);
		}
		ArrayList<Integer> sortedArray = (ArrayList<Integer>) ms.sort(array);
		assertEquals(sorted, ms.sort(array));
		assertFalse(array.equals(sortedArray));
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
		assertEquals(reversed, ms.reverse(array));
		List<Integer> reversedArray = (ArrayList<Integer>) ms.reverse(array);
		assertFalse(array.equals(reversedArray));
	}

	@Test
	public void testIsMonotonous(){
		assertEquals(true, ms.isMonotonous(Arrays.asList(1,2,3,4,5,6)));
		assertEquals(true, ms.isMonotonous(Arrays.asList(6,5,4,3,2,1,1,1)));
		assertEquals(false, ms.isMonotonous(Arrays.asList(1,2,1,4,5,4)));
		assertEquals(true, ms.isMonotonous(Arrays.asList(1,1,1)));
	}

}
