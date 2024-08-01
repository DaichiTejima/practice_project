package practice.practice03;

public class Employee {
	private String name;

	private int age;

	public Employee(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}

	public String getNamme() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void selfIntroduction() {
		System.out.println("氏名：" + name);
		System.out.println("年齢：" + age);
	}

}