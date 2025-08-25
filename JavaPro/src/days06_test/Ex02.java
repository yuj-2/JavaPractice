package days06_test;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 가위(1) 바위(2) 보(3)  컴퓨터 - 사용자
		// 사용자\컴퓨터  가위(1) 바위(2) 보(3) 
		//   가위(1)     0무      1컴      2사
		//   바위(2)     -1사      0무      1컴
		//   보(3)      -2컴      -1사      0무
		int user, com;
		String input;
		boolean isFlag = true;
		String [] rspArr = {"", "가위", "바위", "보"};
		int inputCount = 0;
		
		
		Random rnd = new Random();
		com = (int)(rnd.nextInt(3)+1);
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		String regex = "[1-3]";
		
		do {
			inputCount++;
			System.out.printf("[%d번째] 가위(1) 바위(2) 보(3) 선택 : ",inputCount);
			input = scanner.next();
			if(!(isFlag = input.matches(regex))) {
				System.out.println("잘못된 입력입니다");
				if(inputCount == 3) {
					System.out.println("3번째 게임입니다 종료합니다");
					return;
				}
			}//if
			
		} while (!isFlag);
		user = Integer.parseInt(input);
		
		System.out.printf("com=%s, user=%s\n", rspArr[com], rspArr[user]);
		switch (com - user) {
		case 0:
			System.out.println("무승부");
			break;
		case 1: case -2:
			System.out.println("컴퓨터 승리");
			break;
		case -1: case 2:
			System.out.println("사용자 승리");
			break;
		}//switch
		
	}

}
