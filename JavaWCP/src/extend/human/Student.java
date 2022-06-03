package extend.human;

public class Student extends Human {
	private int score;
	
	public Student(String name, int age, int score) {
		super(name, age);
		this.score = score;
	}
	
	public String getStudentProfile() {
		String profile = "" + super.age + "";
		profile += "" + this.score + "";
		return profile;
	}
}
