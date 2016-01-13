package name.alexeykiselev.codility.java.iterations;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryGapTests {

	@Test
	public void test() {
		assertEquals(2, BinaryGap.solution(9));
		assertEquals(4, BinaryGap.solution(529));
		assertEquals(1, BinaryGap.solution(20));
		assertEquals(0, BinaryGap.solution(15));
		assertEquals(5, BinaryGap.solution(1041));
		assertEquals(0, BinaryGap.solution(1));
		assertEquals(0, BinaryGap.solution(2));
		assertEquals(0, BinaryGap.solution(4));
		assertEquals(0, BinaryGap.solution(8));
		assertEquals(0, BinaryGap.solution(2147483647));
	}

}
