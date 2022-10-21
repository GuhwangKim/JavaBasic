package ramda;

public interface Comparator<T> {
	public int compare(T o1, T o2);
	// 제네릭 T는 해당 메소드 혹은 인터페이스를 구성하는 타입이 T형태라는 것 
}
