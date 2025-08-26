package days07_test;

import java.util.Arrays;
import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {
		// 중복 로또 번호 제거
		// 로또 번호 저장할 변수 선언
		Random rnd = new Random();
		int [] lottos = new int[6];
		int n;
		int index = 0;
		boolean flag = false;
		
		while (index < 6) {
			n = rnd.nextInt(45)+1;
			flag = false;
			for (int i = 0; i < index; i++) {
				if (lottos[i]==n) {
					flag = true;
					break;
				}//if
			}//for
			if (!flag) {
				lottos[index++] = n;
			}//if
		}//while
		System.out.println(Arrays.toString(lottos));
		
	}

}
