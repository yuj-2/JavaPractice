package days05_test;

public class Ex06_03 {
	// 2+3+4=9
	// 1+2+3=6
	public static void main(String[] args) {
//		int i=1, sum=0;
//		while (i++<=3) {
//			System.out.printf("%d+",i);
//			sum += i;
//		}//while
//		System.out.printf("\b=%d",sum);
		
		int i=0, sum=0;
		while (++i<=3) {
			System.out.printf("%d+",i);
			sum += i;
		}//while
		System.out.printf("\b=%d",sum);
	}//main

}
