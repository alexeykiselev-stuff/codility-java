package name.alexeykiselev.codility.java.countingelements;

public class MissingInteger {
	public static int solution(int[] A) {
		int j = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] <= 0) {
				int tmp = A[i];
				A[i] = A[j];
				A[j] = tmp;
				j++;
			}
		}
		
		int[] a = new int[A.length - j];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = A[i + j];
		}
		
		for (int i = 0; i < a.length; i++) {
			int index = Math.abs(a[i]) - 1;
			if (index >= 0 && index < a.length && a[index] > 0) {
				a[index] = -a[index];
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0)
				return i + 1;
		}
		
		return a.length + 1;
	}
}
