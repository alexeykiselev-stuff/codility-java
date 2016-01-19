package name.alexeykiselev.codility.java.prefixsums;

import static org.junit.Assert.*;

import org.junit.Test;

public class CountDivTests {

	@Test
	public void test() {
		assertEquals(3, CountDiv.solution(6, 11, 2));
		assertEquals(6, CountDiv.solution(0, 10, 2));
		assertEquals(5, CountDiv.solution(1, 10, 2));
		assertEquals(5, CountDiv.solution(1, 11, 2));
		assertEquals(3, CountDiv.solution(1, 11, 3));
		assertEquals(2, CountDiv.solution(0, 1, 1));
		assertEquals(1, CountDiv.solution(0, 1, 2));
		assertEquals(0, CountDiv.solution(10, 11, 3));
		assertEquals(20, CountDiv.solution(11, 345, 17));
	}

}
