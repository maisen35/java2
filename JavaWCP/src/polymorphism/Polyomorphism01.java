package polymorphism;

import polymorphism.human.Employee;
import polymorphism.human.Human;
import polymorphism.human.Student;

public class Polyomorphism01 {
	public static void main(String[] args) {
		Human human1 = new Student("", 17, 70);
		System.out.println("Humanクラスのメソッド：プロフィールを紹介します。" + human1.getProfile());
		
		Human human2 = new Employee("", 28, "");
		System.out.println("Humanクラスのメソッド：プロフィールを紹介します。" + human2.getProfile());
	}
}
