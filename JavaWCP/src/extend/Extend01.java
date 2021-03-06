package extend;

import extend.human.Employee;
import extend.human.Human;
import extend.human.Student;

public class Extend01 {
	public static void main(String[] args) {
		Human sugimoto = new Human("杉本" , 16);
		System.out.println("" + sugimoto.getName() + "");
		
		Student sato = new Student("佐藤", 17, 70);
		System.out.println("" + sato.getName());
		System.out.println("" + sato.getStudentProfile());
		
		Employee human = new Employee("田中", 28, "システム部");
		System.out.println("" + human.getName());
		
		Employee tanaka = (Employee) human;
		System.out.println("" + tanaka.getEmployeeProfile());
		
		Extend01.printName(sugimoto);
		Extend01.printName(sato);
		Extend01.printName(tanaka);
		
	}
	
	public static void printName(Human human) {
		System.out.println("" + human.getName());
	}
}
