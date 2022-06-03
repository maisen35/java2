package practice;

public class Chapter12 {
	public static void main(String[] args) {
		NoCapsuleMan man = new NoCapsuleMan("小林", 32);
		System.out.println("名前は" + man.getName() + "です");
		System.out.println("ねんれいは" + man.getAge() + "です");
		man.setAge(33);
		System.out.println("誕生日を迎えたので年齢が" + man.getAge() + "になりました");
	}
}
