package method.q05;

public class Triangle {
	
	public static void main(String[] args) {
		
		
		int num1 = 8;
		int num2 = 5;
		int area = getTriangleArea(num1,num2);
		System.out.println("底辺：" + num1);
		System.out.println("高さ：" + num2);
		System.out.println("三角形の面積：" + area);
	}
	public static int getTriangleArea(int num1, int num2) {
		return (num1 * num2) / 2;
	}
}