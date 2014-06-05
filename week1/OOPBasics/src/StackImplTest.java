import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class StackImplTest {
	private Stack st;
	@Before
	public void setUp() throws Exception {
		st = new StackImpl(10);
	}
	

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLength() {
		Stack stack = new StackImpl(11);
		assertEquals(0, stack.length());
	}

	@Test
	public void testpush() {
		Stack stack = new StackImpl();
		boolean bool = stack.push(3);
		assertEquals(true, bool);
	}
	
	@Test
	public void testIsEmpty() {
		Stack stack = new StackImpl();
		stack.push(1);
		assertEquals(true, st.isEmpty());
		assertEquals(false, stack.isEmpty());
	}
	
	@Test
	public void testIsFull() {
		Stack stack = new StackImpl(1);
		stack.push(1);
		assertEquals(true, stack.isFull());
		assertEquals(false, st.isFull());
	}
	
	@Test
	public void testIsUnique() {
		Stack stack = new StackImpl(6);
		Stack stack1 = new StackImpl(6);
		stack1.push(1);
		stack1.push(2);
		assertEquals(true, stack1.isUnique(5));
		stack.push(1);
		stack.push(2);
		stack.push(1);
		stack.push(2);
		assertEquals(false, stack.isUnique(2));
	}
	
	
}
