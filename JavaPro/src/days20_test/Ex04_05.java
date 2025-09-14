package days20_test;

import java.util.Scanner;

public class Ex04_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("비밀번호 입력: ");
		String pw = scanner.next();
		String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[^A-Za-z0-9]).{8,15}$";
		
		if(pw.matches(regex))
			System.out.println("올바른 비밀번호입니다");
		else System.out.println("잘못된 비밀번호입니다");		
		
	}

}
