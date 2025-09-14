package days13_test;

import java.io.IOException;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) throws IOException {
		final int STUDENT_COUNT=30;
		
		String [] names = new String[STUDENT_COUNT];
		int [][] score = new int[STUDENT_COUNT][5];
		
		int count = 0;
		

		
		
		Scanner scanner = new Scanner(System.in);
		char con = 'Y';
		
		do {
			System.out.printf("[%d] 국영수 점수 랜덤? ",count);
			names[count] = getName();
			score[count][0] = getScore("국어");
			score[count][1] = getScore("영어");
			score[count][2] = getScore("수학");
			score[count][3] = score[count][0] + score[count][1] + score[count][2];
			
			
			count++;
			System.out.print("계속?");
			con = (char)System.in.read();
			System.in.skip(System.in.available());
			
		} while (Character.toUpperCase(con)=='Y');
		
		getRanking(score, count);
		
		
		for (int i = 0; i < count; i++) {
			System.out.printf("[%d] %s\t%d\t%d\t%d\t%d\t%d\n",
					i+1,names[i],score[i][0],
					score[i][1],score[i][2],score[i][3],score[i][4]);
		}
		
	}//main

	private static void getRanking(int[][] score, int count) {
		for (int i = 0; i < count; i++) {
			score[i][4] = 1;
			for (int j = 0; j < count; j++) {
				if(score[i][3] < score[j][3]) score[i][4]++;
			}
		}
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
