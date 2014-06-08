import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ReverseGenericCollectionTest {
	private ReverseGenericCollection collection;
	@Before
	public void setUp() throws Exception {
		collection = new ReverseGenericCollection();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReversedCollectionWithIntegers() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
			    for (int i=0; i < 10; i++)
			      numbers.add(i);
	    ArrayList<Integer> reversedNumbers = new ArrayList<Integer>();
			    for (int i=9; i >= 0; i--)
			    	reversedNumbers.add(i);
		collection.reverse(numbers);
		assertEquals(reversedNumbers, numbers);
	}

}
