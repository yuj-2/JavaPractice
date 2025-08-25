package days06_test;

import java.util.Scanner;

public class Ex03_02 {

	public static void main(String[] args) {
		// [문제]
		// 두 정수 n, m을 입력받아서
		// 두 정수 사이의 합을 출력
		// 입력형식)
		// > n, m 입력 ? 2 5엔터
		// 출력형식)
		// > 2+3+4+5=14
		
		int n,m, sum=0;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("n, m 입력 : ");
		if(!scanner.hasNextInt()) {
			System.out.println("잘못된 입력");
			return;
		}
		
		n = scanner.nextInt();
		m = scanner.nextInt();
		
		int max = Math.max(n, m);
		int min = Math.min(n, m);
		
		for (int i = min; i <= max; i++) {
			System.out.printf("%d+",i);
			sum += i;
			
		}//for
		System.out.printf("\b=%d",sum);
	}

}
