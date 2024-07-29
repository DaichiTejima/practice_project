package method.q07;

public class SumNumbers {
	
	public static void main(String[] args) {
		int num1 = 5;
		double num2 = 3.3;
		double sum = calculateSum(num1, num2);
		System.out.println("第一引数：" + num1);
		System.out.println("第二引数：" + num2);
		System.out.println("加算結果：" + sum);
	}
	
	public static double calculateSum(int num1, double num2) {
		return num1 + num2;
	}
}