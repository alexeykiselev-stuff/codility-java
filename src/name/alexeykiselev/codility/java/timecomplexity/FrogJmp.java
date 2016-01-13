package name.alexeykiselev.codility.java.timecomplexity;

public class FrogJmp {
	public static int solution(int X, int Y , int D) {
		int remain = (Y - X) % D;
		int leaps = (Y - X) / D;

		if (remain > 0)
			return leaps + 1;
		else
			return leaps;
	}
}
