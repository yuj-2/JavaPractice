package days07;

public class Ex05_03 {

	public static void main(String[] args) {
		// 가로 구구단 출력
		// 세로 구구단 출력
		for (int j = 1; j <= 9; j++) {      // 1~9
			for (int i = 2; i <= 9; i++) {  // 단
				System.out.printf("%d*%d=%02d ", i, j, i*j );
			}
			System.out.println(); // 개행
		}
		
		
		
		/*
		for (int i = 2; i <= 9; i++) {
			System.out.printf("%d*%d=%02d ", i, 1, i*1 );
		}
		System.out.println(); // 개행
		
		for (int i = 2; i <= 9; i++) {
			System.out.printf("%d*%d=%02d ", i, 2, i*2 );
		}
		System.out.println(); // 개행
		// :
		for (int i = 2; i <= 9; i++) {
			System.out.printf("%d*%d=%02d ", i, 9, i*9 );
		}
		System.out.println(); // 개행
		*/
		/*
		System.out.printf("2*1=2 ");
		System.out.printf("3*1=3 ");
		System.out.printf("4*1=2 ");
		System.out.printf("5*1=2 ");
		System.out.printf("6*1=2 ");
		System.out.printf("7*1=2 ");
		System.out.printf("8*1=2 ");
		System.out.printf("9*1=9 ");
		*/

	} // main

} // class

/*
2*1=02	 3*1=03	 4*1=04	 5*1=05	 6*1=06	 7*1=07	 8*1=08	 9*1=09	 
2*2=04	 3*2=06	 4*2=08	 5*2=10	 6*2=12	 7*2=14	 8*2=16	 9*2=18	 
2*3=06	 3*3=09	 4*3=12	 5*3=15	 6*3=18	 7*3=21	 8*3=24	 9*3=27	 
2*4=08	 3*4=12	 4*4=16	 5*4=20	 6*4=24	 7*4=28	 8*4=32	 9*4=36	 
2*5=10	 3*5=15	 4*5=20	 5*5=25	 6*5=30	 7*5=35	 8*5=40	 9*5=45	 
2*6=12	 3*6=18	 4*6=24	 5*6=30	 6*6=36	 7*6=42	 8*6=48	 9*6=54	 
2*7=14	 3*7=21	 4*7=28	 5*7=35	 6*7=42	 7*7=49	 8*7=56	 9*7=63	 
2*8=16	 3*8=24	 4*8=32	 5*8=40	 6*8=48	 7*8=56	 8*8=64	 9*8=72
2*9=18	 3*9=27	 4*9=36	 5*9=45	 6*9=54	 7*9=63	 8*9=72	 9*9=81	 
*/
