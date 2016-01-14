package name.alexeykiselev.codility.java.timecomplexity;

public class PermMissingElem {
	public static int solution(int[] A) {
		int factorial = 1;
		int elementsSum = 0;
		
		for (int i = 0; i < A.length; i++) {
			factorial += (i + 2);
			elementsSum += A[i];
		}
		
		return factorial - elementsSum;
	}
}
