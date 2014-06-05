import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PairTest {
	private Pair ms;

	@Before
	public void setUp() throws Exception {
		ms = new Pair(1, 2);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetters() {
		assertEquals(1, ms.getFirst());
		assertEquals(2, ms.getSecond());
	}
	
	@Test
	public void testToString() {
		assertEquals("(1,2)", ms.toString());
	}
	
	@Test
	public void testEquals() {
		Pair pair1 = new Pair(1,2);
		Pair pair2 = new Pair(2,2);
		assertEquals(true, ms.equals(pair1));
		assertEquals(false, ms.equals(pair2));
	}

}
