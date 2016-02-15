package name.alexeykiselev.codility.java.sorting;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTests {

	@Test
	public void test() {
		assertEquals(0, Triangle.solution(new int[] {10}));
		assertEquals(0, Triangle.solution(new int[] {10, 5}));
		assertEquals(1, Triangle.solution(new int[] {10, 5, 8}));
		assertEquals(1, Triangle.solution(new int[] {10, 2, 5, 1, 8, 20}));
		assertEquals(0, Triangle.solution(new int[] {10, 50, 5, 1}));
		assertEquals(1, Triangle.solution(new int[] {Integer.MAX_VALUE, 5, Integer.MAX_VALUE, 10, Integer.MAX_VALUE, 8}));
	}

}
