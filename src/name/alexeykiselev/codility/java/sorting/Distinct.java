package name.alexeykiselev.codility.java.sorting;

import java.util.Arrays;

public class Distinct {
	public static int solution(int[] A) {
		Arrays.sort(A);
		
		int count = 0;
		int prev = Integer.MIN_VALUE;
		for (int i = 0; i < A.length; i++) {
			if (A[i] != prev) {
				prev = A[i];
				count++;
			}
		}
		
		return count;
		
		/*
		int[] distincts = new int[A.length];
		for (int i = 0; i < distincts.length; i++) {
			distincts[i] = Integer.MIN_VALUE;
		}
		
		for (int i = 0; i < A.length; i++) {
			int index = 0;
			for (int j = 0; j < distincts.length; j++) {
				if (distincts[j] == Integer.MIN_VALUE || distincts[j] == A[i]) {
					index = j;
					break;
				}
			}
			distincts[index] = A[i];
		}
		
		int count = 0;
		while (count < distincts.length) {
			if (distincts[count] == Integer.MIN_VALUE)
				break;
			count++;
		}
		
		return count;
		*/
	}

}
