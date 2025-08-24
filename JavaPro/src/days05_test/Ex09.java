package days05_test;

public class Ex09 {

	public static void main(String[] args) {
		//1~3 랜덤 10개 
		for (int i = 0; i < 10; i++) {
			int n = (int)(Math.floor(Math.random()*3)) +1;
			System.out.println(n);
		}
	}

}
