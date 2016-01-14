package name.alexeykiselev.codility.java.countingelements;

import static org.junit.Assert.*;

import org.junit.Test;

public class FrogRiverOneTests {

	@Test
	public void test() {
		assertEquals(6, FrogRiverOne.solution(5, new int[] {1, 3, 1, 4, 2, 3, 5, 4}));
		assertEquals(4, FrogRiverOne.solution(5, new int[] {1, 2, 3, 4, 5, 5, 4, 3, 2, 1}));
		assertEquals(4, FrogRiverOne.solution(5, new int[] {5, 4, 3, 2, 1, 1, 2, 3, 4, 5}));
		assertEquals(8, FrogRiverOne.solution(5, new int[] {5, 5, 4, 4, 3, 3, 2, 2, 1, 1}));
		assertEquals(-1, FrogRiverOne.solution(5, new int[] {4, 4, 3, 3, 2, 2, 1, 1}));
	}

}
