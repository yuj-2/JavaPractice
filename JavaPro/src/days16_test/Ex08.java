package days16_test;

public class Ex08 {
	public static void main(String[] args) {
		//가변인자
		int result = sum(1,2,3);
		System.out.println(result);
		
	}

	private static int sum(int...m) {
		int result = 0;
		for (int i = 0; i < m.length; i++) {
			result += m[i];
		}
		return result;
	}
}
