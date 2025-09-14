package days15_test;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

import days14.Student;

public class Ex01_test {
	public static void main(String[] args) throws IOException {
		final int CLASS_COUNT = 3;
		final int STUDENT_COUNT = 30;
		
		Student [][] students = new Student[CLASS_COUNT][STUDENT_COUNT];
		
		int [] counts = new int[CLASS_COUNT];
		
		inputStudentInfo(students, counts);
		
		studentRanking(students, counts);
		
		printStudentInfo(students, counts);
		
	}//main

	private static void printStudentInfo(Student[][] students, int[] counts) {
		for (int i = 0; i < counts.length; i++) {
			System.out.printf("[%d반] 학생 수 : %d명\n", i+1, counts[i]);
			for (int j = 0; j < counts[i]; j++) {
				System.out.printf("%s",students[i][j].getInfo());
			}
		}
	}

	private static void studentRanking(Student[][] students, int[] counts) {
		for (int i = 0; i < counts.length; i++) {
			for (int j = 0; j < counts[i]; j++) {
				for (int i2 = 0; i2 < counts.length; i2++) {
					for (int j2 = 0; j2 < counts[i2]; j2++) {
						if(students[i][j].tot < students[i2][j2].tot) {
							students[i][j].wrank++;
							if(i==i2) students[i][j].rank++;
						}
					}
				}
			}
		}
	}

	private static void inputStudentInfo(Student[][] students, int[] counts) throws IOException {
		Scanner scanner = new Scanner(System.in);
		char con = 'Y';
		
		int ban;
		int no, kor, mat, eng, tot, rank, wrank;
		String name;
		double avg;
		
		
		do {
			System.out.print("학생 반 입력: ");
			ban = scanner.nextInt();
			System.out.printf("[%d반] %d번 학생 이름 국어 영어 수학 입력? ", ban,
					counts[ban-1]+1);
			no = counts[ban-1]+1;
			name = getName();
			kor = getScore();
			eng = getScore();
			mat = getScore();
			tot = kor + eng + mat;
			avg = (double)tot/3;
			rank = wrank = 1;
			
			students[ban-1][counts[ban-1]] = new Student();
			students[ban-1][counts[ban-1]].no = no;
			students[ban-1][counts[ban-1]].name = name;
			students[ban-1][counts[ban-1]].kor = kor ;
			students[ban-1][counts[ban-1]].mat = mat;
			students[ban-1][counts[ban-1]].eng = eng;
			students[ban-1][counts[ban-1]].tot = tot;
			students[ban-1][counts[ban-1]].avg = avg;
			students[ban-1][counts[ban-1]].rank = rank;
			students[ban-1][counts[ban-1]].wrank = wrank;
			
			counts[ban-1]++;
			
			System.out.print("계속 입력 ? ");
			con = (char)(System.in.read());
			System.in.skip(System.in.available());
			
			
		} while (Character.toUpperCase(con)=='Y');
	}

	private static int getScore() {
		Random rnd = new Random();
		return rnd.nextInt(101);
	}

	private static String getName() {
		Random rnd = new Random();
		char [] nameArr = new char[3];
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i] = (char)(rnd.nextInt('힣'-'가'+1)+'가');
		}
		String name = String.valueOf(nameArr);
		return name;
	}
}
