package scratch;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinearInTest {

	@Test
	public void test() {
		int[] outer = { 1, 2, 4, 6 };
		int[] inner = {2, 4};
		assertTrue(LinearIn.linearIn(outer, inner));
		
		outer = new int[] { 1, 2, 4, 6};
		inner = new int[] {2, 3, 4};
		assertFalse(LinearIn.linearIn(outer, inner));
		
		outer = new int[] { 1, 2, 4, 6};
		inner = new int[] {2, 3, 4};
		assertTrue(LinearIn.linearIn(outer, inner));
		
		
	}
		
	
	}

