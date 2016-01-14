package name.alexeykiselev.codility.java.countingelements;

public class FrogRiverOne {
	public static int solution(int X, int[] A) {
		boolean[] seen = new boolean[X];
		int factorial = 0;
		for (int i = 1; i <= X; i++)
			factorial += i;
		
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			if (!seen[A[i] - 1]) {
				seen[A[i] - 1] = true;
				sum += A[i];
			}
			if (sum == factorial)
				return i;
		}

		return -1;
	}
}
