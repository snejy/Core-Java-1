import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class getDigitOfNumberTest {
	private getDigitOfNumber number;

	@Before
	public void setUp() throws Exception {
		number = new getDigitOfNumber();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testWithOneDigitNumbers() {
		int a = 9;
		assertEquals(1, number.countDigits(a));
	}

	@Test
	public void testWithMoreDigitNumbers() {
		int a = 11;
		assertEquals(2, number.countDigits(a));
	}
	
	@Test
	public void testWithThreeDigitNumbers() {
		int a = 122;
		int c = 12465;
		assertEquals(3, number.countDigits(a));
		assertEquals(5, number.countDigits(c));
	}

}
