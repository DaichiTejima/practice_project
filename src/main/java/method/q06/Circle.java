package method.q06;

public class Circle {

	public static void main(String[] args) {
		int num = 5;
		double area = getCircleArea(num);
		System.out.println("半径：" + num + ".0");
		System.out.println("円の面積：" + area);
	}

	public static double getCircleArea(int num) {
		return (num * num) * 3.14;
	}
}
