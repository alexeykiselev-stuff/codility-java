package name.alexeykiselev.codility.java.countingelements;

import static org.junit.Assert.*;

import org.junit.Test;

public class PermCheckTests {

	@Test
	public void test() {
		assertEquals(1, PermCheck.solution(new int[] {4, 1, 3, 2}));
		assertEquals(0, PermCheck.solution(new int[] {4, 1, 3}));
		assertEquals(1, PermCheck.solution(new int[] {1}));
		assertEquals(0, PermCheck.solution(new int[] {3}));
	}

}
