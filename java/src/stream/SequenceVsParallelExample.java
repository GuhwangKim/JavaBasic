package stream;

import java.util.Arrays;
import java.util.List;

public class SequenceVsParallelExample {

	public static void work(int value) {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

		}
	}

	// 병렬처리
	public static long test(List<Integer> list) {
		long start = System.nanoTime();
		list.stream().parallel().forEach(a -> work(a));
		long end = System.nanoTime();
		long runTime = start - end;
		return runTime;
	}

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3);

	}

}
