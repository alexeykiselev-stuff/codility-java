package name.alexeykiselev.codility.java.iterations;

public class BinaryGap {

	public static int solution(int N) {
		int x = N;
		int maxGap = 0;
		int gap = 0;
		boolean gapStarted = false;
		while (x > 0) {
			int remain = x % 2;
			x = x / 2;
			if (remain > 0) {
				if (gapStarted) {
					if (maxGap < gap)
						maxGap = gap;
					gap = 0;
				} else {
					gapStarted = true;
				}
			} else {
				if (gapStarted)
					gap++;
			}
		}
		
		return maxGap;
	}
	
}
