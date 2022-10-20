package ramda;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	private static int[] scores = {92, 95, 87};
	
	public static int maxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score : scores) {
			result = operator.applyAsInt(result, score);
			// 두개의 값을 연산 
		}
		return result;
	}
	
	public static void main(String[] args) {
		// 최대값 얻기 
		int max = maxOrMin(
				(a,b)-> {
					// 람다식에서 연산을 
					if(a>=b) {
						return a;
					} else {
						return b;
					}
				}
				);
		System.out.println("최대값 : "+max);
	}

}
