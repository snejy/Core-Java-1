import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ReduceFilePathTest {
	private ReduceFilePath file;

	@Before
	public void setUp() throws Exception {
		file = new ReduceFilePath();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		String wrong_path = "/home//radorado/code/./hackbulgaria/week0/../";
		assertEquals("/home/radorado/code/hackbulgaria", file.reducePath(wrong_path));
	}

}
