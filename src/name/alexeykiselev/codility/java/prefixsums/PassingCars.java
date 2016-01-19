package name.alexeykiselev.codility.java.prefixsums;

public class PassingCars {
	public static int solution(int[] A) {
		int zeroes = 0;
		int result = 0;
		
		for (int i = 0; i < A.length; i++) {
			if (A[i] == 0)
				zeroes++;
			
			result += A[i] * zeroes;
			
			if (result > 1e9)
				return -1;
		}
		
		return result;
	}
}
