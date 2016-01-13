package name.alexeykiselev.codility.java.timecomplexity;

import static org.junit.Assert.*;

import org.junit.Test;

public class FrogJmpTests {

	@Test
	public void test() {
		assertEquals(3, FrogJmp.solution(10, 85, 30));
		assertEquals(6, FrogJmp.solution(0, 30, 5));
		assertEquals(0, FrogJmp.solution(0, 0, 5));
		assertEquals(1, FrogJmp.solution(0, 5, 10));
		assertEquals(1, FrogJmp.solution(9, 10, 10));
		assertEquals(1, FrogJmp.solution(999999999, 1000000000, 10));
	}

}
