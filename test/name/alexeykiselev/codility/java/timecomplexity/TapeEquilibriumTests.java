package name.alexeykiselev.codility.java.timecomplexity;

import static org.junit.Assert.*;

import org.junit.Test;

public class TapeEquilibriumTests {

	@Test
	public void test() {
		assertEquals(1, TapeEquilibrium.solution(new int[] {3, 1, 2, 4, 3}));
		assertEquals(2, TapeEquilibrium.solution(new int[] {3, 1}));
		assertEquals(0, TapeEquilibrium.solution(new int[] {0, 0, 0, 0}));
		assertEquals(0, TapeEquilibrium.solution(new int[] {-3, -1, -2,}));
		assertEquals(1, TapeEquilibrium.solution(new int[] {-3, -1, -2, -4, -3}));
		assertEquals(1, TapeEquilibrium.solution(new int[] {3, -1, 2, -4, 3}));
		assertEquals(50, TapeEquilibrium.solution(new int[] {-10, -20, -50, -30}));
	}

}
