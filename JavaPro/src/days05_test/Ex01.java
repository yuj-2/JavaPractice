package days05_test;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		int score;
		char grade='가';
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		
		if(!scanner.hasNextInt()) {
			System.out.println("잘못된 점수 입력입니다");
			return ;
		}
		
		score = scanner.nextInt();
		
		switch (0 <= score && score <= 100 ? 1 : 0) {
		case 1:
			switch (score/10) {
			case 10:
			case 9:
				grade = '수';
				break;
			case 8:
				grade='우';
				break;
			case 7:
				grade='미';
				break;
			case 6:
				grade='양';
				break;
			default:
				grade='가';
				break;
			}//case1
			System.out.printf("%d점은 \"%c\"입니다", score, grade);
			break;

		default:
			System.out.println("잘못된 점수입니다");
			break;
		}//switch
	}

}
