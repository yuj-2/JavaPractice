package days05_test;

public class Ex06_02 {

	public static void main(String[] args) {
		// 1~10=55 합 출력 
		int n=1, sum=0;
		while (n <= 10) {
			System.out.printf("%d+",n);
			sum += n;
			n++;
		}//while
		System.out.printf("\b=%d",sum);
	}

}
