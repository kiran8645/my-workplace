package ipractise;

import java.io.FileNotFoundException;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class C implements IOveriding {

	// public void m1() throws FileNotFoundException //1 SQLException allowed
	// public void m1() throws FileNotFoundException 2 file not found not allowed coz of different type
	// allowed
	// public void m1() throws FileNotFoundException 3
	public void m1() {
		System.out.println("m1");
	}

	public void m2() {
		System.out.println("m2");

	}

	public void m3() {
		System.out.println("m3");
	}

	public static void main(String[] args) {
		// C c = new C();
		IOveriding C = new C(); // polymorphically object cretion
		try {
			C.m1();
		} catch (SQLException e) {
			System.out.println("m1");
		}
		C.m2();
		// c.m3();
		// try {
		// C.m3();
		// } catch (SQLException s) {
		// System.out.println("Handled");
		// }
	}
}
