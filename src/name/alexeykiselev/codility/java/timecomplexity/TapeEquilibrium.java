package name.alexeykiselev.codility.java.timecomplexity;

public class TapeEquilibrium {
	public static int solution(int[] A) {
		int[] sums = new int[A.length];
		int sum = 0;
		for (int i = 0; i < A.length; i++) {
			sum += A[i];
			sums[i] = sum;
		}
		int minDifference = Integer.MAX_VALUE;
		for (int i = 0; i < A.length - 1; i++) {
			sum -= A[i];
			int difference = Math.abs(sum - sums[i]);
			if (minDifference > difference)
				minDifference = difference;
		}
		
		return minDifference;
	}
}
