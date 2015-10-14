package basiccodesdemo;

public class Sumof4 {
	static int a, b, c, d, s, n = 3003;

	public static void main(String[] args) {
		a = n % 10;
		b = n % 100/10;
		c = n % 1000/10;
		d = n / 1000;
		s = a+b+c+d;
		System.out.println(s);
	}

}
