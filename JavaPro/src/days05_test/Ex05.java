package days05_test;

import java.util.Scanner;

public class Ex05 {
//			1~10+= 합 출력
//			1) + 제거
//			2) 짝수의 합 출력
//			2+4+6+8+10=30
//			3) 홀수의 합 출력
//			1+3+5+7+9 =25 

public static void main(String[] args) {
	//1)
//	int n, sum=0;
//	
//	for (int i = 1; i < 11; i++) {
//		sum += i;
//		System.out.printf("%d+",i);
//		
//	}//for
//	System.out.printf("\b=%d",sum);
	
	//2)
//	int n, sum=0;
//	for (int i = 1; i < 11; i++) {
//		if(i%2==1) continue;
//		sum += i;
//		System.out.printf("%d+",i);
//	}//for
//	System.out.printf("\b=%d",sum);
	
	//3)
	int n, sum=0;
	for (int i = 1; i < 11; i++) {
		if(i%2==0) continue;
		sum += i;
		System.out.printf("%d+",i);
	}//for
	System.out.printf("\b=%d",sum);
	
}//main

}//class
