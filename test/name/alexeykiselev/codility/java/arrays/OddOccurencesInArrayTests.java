package name.alexeykiselev.codility.java.arrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class OddOccurencesInArrayTests {

	@Test
	public void test() {
		assertEquals(7, OddOccurencesInArray.solution(new int[] {9, 3, 9, 3, 9, 7, 9}));
		assertEquals(1, OddOccurencesInArray.solution(new int[] {1}));
		assertEquals(1, OddOccurencesInArray.solution(new int[] {1, 2, 1, 2, 1}));
		assertEquals(4, OddOccurencesInArray.solution(new int[] {1, 2, 3, 4, 3, 2, 1}));
	}
	
	@Test
	public void testBigArray() {
		int[] big = new int[999999];
		big[0] = 1;
		for (int i = 1; i < big.length; i++) {
			big[i] = 1000000000;
		}
		assertEquals(1, OddOccurencesInArray.solution(big));
	}

}
