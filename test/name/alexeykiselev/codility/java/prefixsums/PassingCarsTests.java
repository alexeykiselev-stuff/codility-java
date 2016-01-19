package name.alexeykiselev.codility.java.prefixsums;

import static org.junit.Assert.*;

import org.junit.Test;

public class PassingCarsTests {

	@Test
	public void test() {
		assertEquals(5, PassingCars.solution(new int[] {0, 1, 0, 1, 1}));
		assertEquals(0, PassingCars.solution(new int[] {1, 1, 1, 1, 1}));
		assertEquals(0, PassingCars.solution(new int[] {0, 0, 0, 0, 0}));
		assertEquals(6, PassingCars.solution(new int[] {0, 0, 0, 1, 1}));
		assertEquals(0, PassingCars.solution(new int[] {1}));
		assertEquals(0, PassingCars.solution(new int[] {0}));
	}

}
