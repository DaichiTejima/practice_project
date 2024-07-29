package method.q08;

public class SumLoop {
	
	public static void main(String[] args) {
		int min = 1;
		int max = 100;
		int sum = sumLoop(min, max);
		
		System.out.println("最小値：" + min);
		System.out.println("最大値：" + max);
		System.out.println("加算結果：" + sum);
	}
	
	public static int sumLoop(int min, int max) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		return sum;
	}
}