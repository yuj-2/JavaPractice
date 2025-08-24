package days05_test;

public class Ex08_02 {

	public static void main(String[] args) {
		// 1+2+3+4+5+6+7+8+9+10+=55
		// 홀수의 합 출력 : ( continue문을 사용해서 )
		// 1+3+5+7+9+=25
		
		int i =0, sum=0;
		while (++i <= 10) {
			if(i%2 == 0) {
				continue;
			}//if
			System.out.printf("%d+",i);
			sum += i;
		}//while
		System.out.printf("\b=%d",sum);
	}

}
