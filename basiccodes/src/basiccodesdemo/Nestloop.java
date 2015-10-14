package basiccodesdemo;

public class Nestloop {
	public static void main(String[] args) {
	int i,n;
	for(n=5;n>=1;n--)
	{
		for(i=1;i<=n;i++)
		{
			System.out.println(i);
			System.out.println();
		}
	}
	}

}
