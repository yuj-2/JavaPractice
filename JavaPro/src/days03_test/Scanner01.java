package days03_test;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		// 홍길동 98 79 37 한번에 입력
		
		
		String name;
		int kor,eng,mat,tot;
		double avg;

		Scanner scanner = new Scanner(System.in);

		System.out.print("이름 국어 영어 수학 : ");

		name = scanner.next();
		kor = scanner.nextInt();
		mat = scanner.nextInt();
		eng = scanner.nextInt();

		tot = kor + eng + mat;
		avg = (double) tot/3;

		System.out.printf("이름: %s \n" + "국어: %d \n" + "영어: %d \n" + "수학: %d \n" + "총점: %d \n"
				+ "평균: %.2f", name, kor, eng, mat, tot, avg);
	}
}
