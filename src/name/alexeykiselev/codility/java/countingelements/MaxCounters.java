package name.alexeykiselev.codility.java.countingelements;

public class MaxCounters {
	public static int[] solution(int N, int[] A) {
		int[] result = new int[N];
		int max = 0;
		int base = 0;
		
		for (int i = 0; i < A.length; i++) {
			int index = A[i] - 1;
			
			if (index == N) {
				base = max;
			} else {
				int value = 0;
				if (result[index] < base) {
					value = result[index] = base + 1;
				} else {
					value = result[index] += 1;
				}
				if (max < value)
					max = value;
			}
		}

		for (int i = 0; i < result.length; i++) {
			if (result[i] < base)
				result[i] = base;
		}
		
		return result;
	}
}
