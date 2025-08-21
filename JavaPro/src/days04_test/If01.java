package days04_test;

import java.util.Scanner;

public class If01 {
	public static void main(String[] args) {
		// [문제] 점수 입력 ( 0~100 )      
		//      수/우/미/양/가
		//      수  90<=   <=100
		//      우  80<=   <= 89
		//      가  0<=    <= 59

		// 출력형식)
		//   95점은 '수'입니다.
		int score;
		char grade = '가';
		System.out.print("점수 입력 : ");
		
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		if (!scanner.hasNextInt()) {
			System.out.print("잘못된 점수입니다!");
		}
		
		score = scanner.nextInt();

		if (0<=score && score <=100) {
			if(score >= 90) grade='수';
			else if(score >= 80) grade='우';
			else if(score >= 70) grade='미';
			else if(score >= 60) grade='양';
			else grade='가';		
			
			System.out.printf("%d점은 '%c'입니다", score, grade);
		} else System.out.print("잘못된 점수입니다!");
	}
}
