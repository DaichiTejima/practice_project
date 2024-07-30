package method.q06;

public class Circle {

	public static void main(String[] args) {
		double num = 5.0;
		double area = getCircleArea(num);
		System.out.println("半径：" + num + ".0");
		System.out.println("円の面積：" + area);
	}

	public static double getCircleArea(double num) {
		return (num * num) * 3.14;
	}
}
