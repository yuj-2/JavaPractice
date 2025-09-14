package days12_test;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Ex01_02 {

	public static void main(String[] args) throws IOException {
		final int STUDENT_COUNT=25;
		String [] names = new String[STUDENT_COUNT];
		int [] kors = new int[STUDENT_COUNT];
		int [] engs = new int[STUDENT_COUNT];
		int [] mats = new int[STUDENT_COUNT];
		int [] tots = new int[STUDENT_COUNT];
		double [] avgs = new double[STUDENT_COUNT];
		
		int count = 0;
		
		String name;
		int kor,mat,eng,tot;
		double avg;
		
		Scanner scanner = new Scanner(System.in);
		char con = 'Y';
		
		do {
			System.out.printf("[%d] 이름 국어 영어 수학 : ", count+1);
			name = getName();
			kor = getScore("국어");
			eng = getScore("영어");
			mat = getScore("수학");
			tot = kor + eng + mat;
			avg = (double)tot/3;
			
			names[count] = name;
			kors[count] = kor;
			engs[count] = eng;
			mats[count] = mat;
			tots[count] = tot;
			avgs[count] = avg;
			
			count++;
			
			System.out.print("계속 입력?");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
			
			
		} while (Character.toUpperCase(con) == 'Y');
		
		System.out.printf("입력받은 학생 수 : %d명\n",count);
		for (int i = 0; i < count; i++) {
			System.out.printf("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\n",
					i+1, names[i],kors[i],engs[i],mats[i],tots[i],avgs[i]);
		}//for
		
	}

	private static int getScore(String string) {
		Random rnd = new Random();
		return rnd.nextInt(101);
	}

	private static String getName() {
		char [] nameArr = new char[3];
		Random rnd = new Random();
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i] = (char)(rnd.nextInt('힣'-'가'+1)+'가');
		}
		String name = String.valueOf(nameArr);
		return name;
	}

}
