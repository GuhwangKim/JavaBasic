package ramda;

import java.util.function.Function;

public class FunctionAncThenComposeExample {
	public static void main(String[] args) {
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		String city;
		
		functionA = m -> m.getAddress();
		functionB = a -> a.getCity();
		
		functionAB = functionA.andThen(functionB);
		// functionAB의 구체적 실현을 정의함 
		// functionA에서 구한 결과를 다음 함수적 인터페이스의 매가값으로 넘겨주고 결과 값을 리턴 여기선 String 
		// functionAB = functionB의 리턴값 즉 a.getCity	
		city = functionAB.apply(new Member("김지호", new Address("한국","서울")));
		// apply에 대입된 member 로 정의된 functionA.andThen(functionB);가 실행됨 
		System.out.println("거주도시 : "+city);
	}
	
	
}
