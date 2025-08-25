package days06_test;

import java.util.Arrays;
import java.util.Random;

public class Ex05_03 {

	public static void main(String[] args) {
		// [문제] 100 개의 정수 중에 가장 큰 값, 작은값
		int [] m = new int[10];
		Random rnd = new Random();
		for (int i = 0; i < m.length; i++) {
			m[i] = rnd.nextInt(100)+1;
		}//for
		System.out.println(Arrays.toString(m));
		int max, min;
		max = m[0];
		min = m[0];
		
		for (int i = 0; i < m.length; i++) {
			max = Math.max(max, m[i]);
			min = Math.min(min, m[i]);
		}
		System.out.printf("큰값:%d  작은값:%d", max, min);
	}

}
