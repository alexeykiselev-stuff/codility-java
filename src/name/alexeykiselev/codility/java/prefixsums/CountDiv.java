package name.alexeykiselev.codility.java.prefixsums;

public class CountDiv {
	public static int solution(int A, int B, int K) {
		int b = B / K;
		int a = A / K;
		int rest = A % K;
		
		if (rest == 0) 
			return b - a + 1;
		else
			return b - a;
	}
}
