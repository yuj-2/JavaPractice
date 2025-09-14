package days12;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

/**
 * @author kenik  
 * @date 2025. 9. 2. 오전 7:16:26 
 * @subject  30명 학생의 이름,국,영,수,총,평, 등 저장/출력
 * @content  배열  X
 *           등수 처리 추가
 *           (시험)
 */ 
public class Ex01_02 {

	public static void main(String[] args) throws IOException {
		 final int STUDENT_COUNT= 25;
		
		 String [] names = new String[STUDENT_COUNT];
		 int [] kors = new int[STUDENT_COUNT];
		 int [] engs = new int[STUDENT_COUNT];
		 int [] mats = new int[STUDENT_COUNT];
		 int [] tots = new int[STUDENT_COUNT];
		 double [] avgs = new double[STUDENT_COUNT];
		 int [] ranks = new int[STUDENT_COUNT];
		 
		 int count = 0;  // 입력받은 학생수  == 각 배열의 index 사용
		 
		 String name;
		 int kor, eng, mat;
		 int tot;
		 double avg;
		 
		 Scanner scanner = new Scanner(System.in);
		 char con = 'Y';
		 
		 do {			
			 System.out.printf("> [%d]번 학생의 이, 국, 영, 수 입력 ? ", count+1);
			 // 홍길동 90 88 99
			 name = getName(); //scanner.next();
			 kor = getScore(scanner, "국어"); // scanner.nextInt();
			 eng = getScore(scanner, "영어"); // scanner.nextInt();
			 mat = getScore(scanner, "수학"); // scanner.nextInt();			 
			 tot = kor + eng + mat;
			 avg = (double)tot/3;		
			 
			 names[count] = name;
			 kors[count] = kor;
			 engs[count] = eng;
			 mats[count] = mat;
			 tots[count] = tot;
			 avgs[count] = avg;
			 
			 count++;			 
			 
			 System.out.print("> 입력 계속 할거니? ");			 
			 con = (char)System.in.read();
			 System.in.skip(System.in.available()); // CRLF(\r\n) 제거
		//} while ( con == 'Y' || con == 'y');
	    } while ( Character.toUpperCase(con) == 'Y');
		 
		// 등수 처리 메서드 선언 + 호출
		// processRanking
		processRanking(tots, ranks);
		 
		// 모든 학생 출력
//		 a 1 1 1
//		 b 2 2 2
//		 c 3 3 3
		 System.out.printf("> 입력받은 학생수 : %d명\n", count);
		for (int i = 0; i < count; i++) {
			System.out.printf("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					 i+1, names[i], kors[i], engs[i], mats[i], tots[i], avgs[i], ranks[i]);
			 
		} // 
		 
		System.out.println(" end ");

	} // main

	private static void processRanking(int[] tots, int[] ranks) {
		for (int i = 0; i < ranks.length; i++) { 
			ranks[i]= 1;
			for (int j = 0; j < ranks.length; j++) { 
				if( tots[i] < tots[j]) {
					ranks[i]++;
				}
			}
		}
	}

	private static String getName() {
		// 한글 1문자 랜덤하게 발생시킬 예정
		char [] nameArr = new char[3];		
		Random rand = new Random();		
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i] = (char)( rand.nextInt('힣' - '가' + 1) + '가' );
		}		 
		String name = String.valueOf(nameArr);
		return name; // 1+"" = "1"  'a'+""="a"  3.14+""="3.14"  true+""="true"
	}

	private static int getScore(Scanner scanner, String subject) {		
		return (int)(Math.random()*101); // 0<= int  <=100
	}

} // class








