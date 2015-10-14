package basiccodesdemo;

public class Marks {

	public static void main(String[] args) {
		int a = 44, b = 56, c = 76, d = 99, e = 88, total;
		double per;
		total = (a + b + c + d + e);
		per = total / 5.0;
		System.out.println("Total Marks" + total);
		System.out.println(per);
		if (a >= 40 && b >= 40 && c >= 40 && d >= 40 && e >= 40 && e >= 40) {
			if (per > 60) {
				System.out.println("First class");
			}
		}
	}
}
