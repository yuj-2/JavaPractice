package days07_test;

import java.io.IOException;

public class Ex03_04 {

	public static void main(String[] args) throws IOException {
//		ASCII  for문 사용해서 출력
//		@content   한 라인에 10개씩 출력하고 개행
//		5라인 출력
//		각 라인마다 라인번호를 붙이자. 
		for (int i = 0, count=1, lineNum=1; i < 256; i++, count++) {
			if(count==1) System.out.printf("%02d : ", lineNum++);
			System.out.printf("[%c]",(char)i);
			if(count%10 == 0) {
				System.out.println();
				count = 0;
			}//if
			
			if(i%50 == 49) {
				System.out.println("엔터");
				System.in.read();
				System.in.skip(System.in.available());
			}
		}
		
		
	}

}
