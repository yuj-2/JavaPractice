package days05_test;

import java.util.Random;

public class Ex09_02 {

	public static void main(String[] args) {
		Random rnd = new Random();
		
		for (int i = 0; i < 3; i++) {
			System.out.println(rnd.nextInt(3)+1);			
		}
	}

}
