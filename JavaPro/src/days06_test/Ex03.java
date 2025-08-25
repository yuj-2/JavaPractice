package days06_test;

import java.util.stream.IntStream;

public class Ex03 {

	public static void main(String[] args) {
		//람다, 스트림
		int sum = IntStream.rangeClosed(0, 10).sum();
		System.out.println(sum);
		
		int sum2 = IntStream
					.rangeClosed(0, 10)
					.filter(n->n%2!=0)
					.sum();
		System.out.println(sum2);
					
	}

}
