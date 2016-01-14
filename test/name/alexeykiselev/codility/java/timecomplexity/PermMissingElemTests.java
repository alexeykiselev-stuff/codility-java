package name.alexeykiselev.codility.java.timecomplexity;

import static org.junit.Assert.*;

import org.junit.Test;

public class PermMissingElemTests {

	@Test
	public void test() {
		assertEquals(4, PermMissingElem.solution(new int[] {2, 3, 1, 5}));
		assertEquals(5, PermMissingElem.solution(new int[] {6, 4, 3, 2, 1}));
		assertEquals(1, PermMissingElem.solution(new int[] {}));
		assertEquals(1, PermMissingElem.solution(new int[] {2}));
		assertEquals(2, PermMissingElem.solution(new int[] {1}));
	}

}
