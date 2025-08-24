package days05_test;

public class Ex03_02 {

	public static void main(String[] args) {
		// 1+2+3+4+5+6+7+8+9+10+=55 합 출력
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
			System.out.printf("%d+",i);
		}System.out.printf("=%d",sum);
	}

}
