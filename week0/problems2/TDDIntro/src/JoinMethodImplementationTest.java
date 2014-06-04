import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class JoinMethodImplementationTest {
	private JoinMethodImplementation join;

	@Before
	public void setUp() throws Exception {
		join = new JoinMethodImplementation();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testWithOneCharStrings() {
		String string1 = "a";
		String string2 = "b";
		Object[]  array = {string1, string2};
		String gluer = ",";
		assertEquals("a,b", join.stichMeUp(gluer, array) );
	}

	@Test
	public void testWithMoreCharStrings() {
		String string1 = "Snejy";
		String string3 = "is";
		String string2 = "awesome.";
		Object[]  array = {string1, string3, string2};
		String gluer = " ";
		assertEquals("Snejy is awesome.", join.stichMeUp(gluer, array) );
	}

}
