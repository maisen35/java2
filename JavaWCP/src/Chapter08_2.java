
public class Chapter08_2 {
	public static void main(String[] args) {
		int[] array = { 2, 3, 4, 5, };
		for(int number:array) {
			if (number % 2 == 0) {
				continue;
			}
			System.out.println(number);
		}
	}
}
