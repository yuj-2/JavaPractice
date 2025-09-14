package days14_test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import days14.Student;

public class Ex14 {
	public static void main(String[] args) throws IOException {
		final int STUDENT_COUNT = 30;
		Student [] students = new Student[STUDENT_COUNT];
		
		int count =0;
		
		String name;
		int kor, mat, eng, tot, no, rank;
		double avg;
		
		Scanner scanner = new Scanner(System.in);
		
		char con = 'Y';
		
		do {
			System.out.printf("[%d]번 학생 이름 국어 영어 수학 출력? ", count);
			name = getName();
			kor = getScore("국어");
			eng = getScore("국어");
			mat = getScore("국어");
			tot = kor+ eng + mat;
			avg = (double)tot/3;
			
			Student s = new Student();
			s.no = count+1;
			s.name = name;
			s.kor = kor;
			s.eng = eng;
			s.mat = mat;
			s.tot = tot;
			s.avg = avg;
			
			students[count] = s;
			count++;
			
			System.out.print("계속? ");
			con = (char)(System.in.read());
			System.in.skip(System.in.available());
		} while (Character.toUpperCase(con)=='Y');
		
		getRanking(students,count);
		
		for (int i = 0; i < count; i++) {
			Student s = students[i];
			System.out.printf("[%d] %s\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					s.no, s.name, s.kor, s.eng, s.mat, s.tot, s.avg, s.rank );
		}
		
		
	}//main

	private static void getRanking(Student[] students, int count) {
		for (int i = 0; i < count; i++) {
			students[i].rank = 1;
			for (int j = 0; j < count; j++) {
				if(students[i].tot < students[j].tot) students[i].rank++;
			}
		}
		
	}

	private static int getScore(String string) {
		Random rnd = new Random();
		return rnd.nextInt(101);
	}

	private static String getName() {
		char [] nameArr = new char[3];
		Random random = new Random();
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i] = (char)(random.nextInt('힣'-'가'+1)+'가');
		}
		String name = String.valueOf(nameArr);
		return name;
	}
}
