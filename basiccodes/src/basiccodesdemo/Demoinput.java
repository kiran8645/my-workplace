package basiccodesdemo;

import java.util.Scanner;

class Demoinput {
	public static void main(String args[]) {
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		boolean b1;
		String s1;
		String c;

		Scanner S = new Scanner(System.in);
		System.out.println("Enter a byte");
		b = S.nextByte();
		System.out.println("You entered byte " + b);

		System.out.println("Enter short");
		s = S.nextShort();
		System.out.println("You entered short " + s);

		System.out.println("Enter an integer");
		i = S.nextInt();
		System.out.println("You entered integer " + i);

		System.out.println("Enter a long");
		l = S.nextLong();
		System.out.println("You entered float " + l);

		System.out.println("Enter a  double");
		d = S.nextDouble();
		System.out.println("You entered float " + d);

		System.out.println("Enter boolean");
		b1 = S.nextBoolean();
		System.out.println("You entered float " + b1);

		System.out.println("Enter String");
		s1 = S.next();
		System.out.println("You entered string " + s1);

		System.out.println("Enter a Character");
		c = S.next();
		System.out.println("You entered char " + c);

	}
}