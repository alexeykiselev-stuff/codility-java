package name.alexeykiselev.codility.java.countingelements;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class MissingIntegerTests {
	
	@Test
	public void test() {
		assertEquals(5, MissingInteger.solution(new int[] {1, 3, 6, 4, 1, 2}));
		assertEquals(3, MissingInteger.solution(new int[] {1, 10, 100, 1000, 5, 2}));
		assertEquals(2, MissingInteger.solution(new int[] {90, 70, 50, 30, 10, 9, 7, 5, 3, 1}));
		assertEquals(1, MissingInteger.solution(new int[] {0}));
		assertEquals(1, MissingInteger.solution(new int[] {0, 2, 4, 6, 8, 10}));
		assertEquals(2, MissingInteger.solution(new int[] {1}));
		assertEquals(1, MissingInteger.solution(new int[] {-1, -100, -200, -5, -6, -10, -1}));
		assertEquals(1, MissingInteger.solution(new int[] {Integer.MIN_VALUE, Integer.MAX_VALUE}));
	}
	
	@Test
	public void testShuffledTiny() {
		int[] a = new int[6];
		int j = 0;
		for (int i = 0; i <=3; i++) {
			a[j] = i;
			j++;
		}
		for (int i = 5; i <= 6; i++) {
			a[j] = i;
			j++;
		}
		
		shuffle(a);
		
		assertEquals(4, MissingInteger.solution(a));
	}
	
	
	@Test
	public void testShuffledSmall() {
		int[] a = new int[20];
		int j = 0;
		for (int i = 0; i <=10; i++) {
			a[j] = i;
			j++;
		}
		for (int i = 12; i <= 20; i++) {
			a[j] = i;
			j++;
		}
		
		shuffle(a);
		
		assertEquals(11, MissingInteger.solution(a));
	}

	@Test
	public void testShuffledBig() {
		int[] a = new int[200];
		int j = 0;
		for (int i = 0; i < 101; i++) {
			a[j] = i;
			j++;
		}
		for (int i = 102; i < 201; i++) {
			a[j] = i;
			j++;
		}
		
		shuffle(a);
		
		assertEquals(101, MissingInteger.solution(a));
	}
	
	private void shuffle(int[] a) {
		Random rnd = new Random();
		for (int i = 0; i < a.length; i++) {
			int j = rnd.nextInt(a.length);
			swap(a, i, j);
		}
	}
	
	private void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
