package name.alexeykiselev.codility.java.arrays;

import java.util.HashSet;
import java.util.Set;

public class OddOccurencesInArray {
	public static int solution(int[] A) {
		int result = 0;
		Set<Integer> seen = new HashSet<>();
		for (int i = 0; i < A.length; i++) {
			if (seen.contains(A[i])) {
				result -= A[i];
				seen.remove(A[i]);
			} else {
				result += A[i];
				seen.add(A[i]);
			}
		}
		
		return result;
	}
}
