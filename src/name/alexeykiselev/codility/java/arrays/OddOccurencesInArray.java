package name.alexeykiselev.codility.java.arrays;

public class OddOccurencesInArray {
	public static int solution(int[] A) {
		int result = 0;
		for (int i = 0; i < A.length; i++) {
			result = result ^ A[i];
		}

		return result;
	}
}
