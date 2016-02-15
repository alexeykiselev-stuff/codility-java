package name.alexeykiselev.codility.java.sorting;

import static org.junit.Assert.*;

import org.junit.Test;

public class DistinctTests {

	@Test
	public void test() {
		assertEquals(3, Distinct.solution(new int[]{ 2, 1, 1, 2, 3, 1 }));
		assertEquals(3, Distinct.solution(new int[]{ 10, -1, -1, -10, 10, -10 }));
		assertEquals(5, Distinct.solution(new int[]{ 1, 2, 3, 4, 5 }));
		assertEquals(21, Distinct.solution(new int[]{ -10, 9, -8, 7, -6, 5, -4, 3, -2, 1, 0, -1, 2, -3, 4, -5, 6, -7, 8, -9, 10 }));
	}

}
