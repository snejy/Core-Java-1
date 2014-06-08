import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class OnOffCollectionTest {
	private OnOffCollection ms;
	@Before
	public void setUp() throws Exception {
		ms = new OnOffCollection();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		ms.add(2);
		ms.add(1);
		ms.add(2);
		assertEquals(2, ms.size());
		ms.add(3);
		assertEquals(3, ms.size());
	}

}
