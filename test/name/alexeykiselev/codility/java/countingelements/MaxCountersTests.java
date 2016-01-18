package name.alexeykiselev.codility.java.countingelements;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaxCountersTests {

	@Test
	public void test() {
		assertArrayEquals(new int[] {3, 2, 2, 4, 2}, MaxCounters.solution(5, new int[] {3, 4, 4, 6, 1, 4, 4}));
		assertArrayEquals(new int[] {3, 4, 3, 5, 3}, MaxCounters.solution(5, new int[] {3, 4, 4, 6, 1, 4, 6, 4, 2, 4}));
		assertArrayEquals(new int[] {0, 0, 0, 0, 0}, MaxCounters.solution(5, new int[] {6, 6, 6, 6, 6, 6, 6}));
		assertArrayEquals(new int[] {2, 2, 2, 2, 2}, MaxCounters.solution(5, new int[] {1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6}));
		assertArrayEquals(new int[] {0, 0, 0, 0, 0}, MaxCounters.solution(5, new int[] {}));
	}

}
