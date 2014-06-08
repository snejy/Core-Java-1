import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ExpressionWithBracketsTest {
	private ExpressionWithBrackets ms;
	@Before
	public void setUp() throws Exception {
		ms = new ExpressionWithBrackets();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testExpressionWithTwoBrackets() {
		String brackets = "()";
		assertEquals(true, ms.isExpressionCorrect(brackets));		
	}


	@Test
	public void testCorrectExpressionWithMoreBrackets() {
		String brackets = "(()()(()))";
		assertEquals(true, ms.isExpressionCorrect(brackets));		
	}

	@Test
	public void testIncorrectExpressionWithMoreBrackets() {
		String brackets = "(())()(()))";
		assertEquals(false, ms.isExpressionCorrect(brackets));		
	}

	@Test
	public void test2IncorrectExpressionWithMoreBrackets() {
		String brackets = "()()())))((())(";
		assertEquals(false, ms.isExpressionCorrect(brackets));		
	}

	@Test
	public void test3IncorrectExpressionWithMoreBrackets() {
		String brackets = "())(()";
		assertEquals(false, ms.isExpressionCorrect(brackets));		
	}
}
	