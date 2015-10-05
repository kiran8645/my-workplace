package ipractise;

import java.sql.SQLException;

public interface IOveriding {
	// public void m1() throws SQLException; //1.SQLException
	// public void m1() throws SQLException; //2 Sql exception
	// public void m1() throws SQLException; 3
	public void m1() throws SQLException;

	public void m2();

	public void m3() throws ArithmeticException;

}
