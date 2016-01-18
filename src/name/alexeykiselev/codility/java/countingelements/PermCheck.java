package name.alexeykiselev.codility.java.countingelements;

public class PermCheck {
	public static int solution(int[] A) {
		for (int i = 0; i < A.length; i++) {
			int index = Math.abs(A[i]) - 1;
			if (index >= 0 && index < A.length && A[index] > 0)
				A[index] = -A[index];
		}
		
		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0)
				return 0;
		}
		
		return 1;
	}
}
