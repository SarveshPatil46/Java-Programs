interface intfA
{
	void name();
}

interface intfB
{
	void institute();
}

interface intfC extends intfA, intfB
{
	void branch();
}

interface intfD
{
	void division();
}

interface intfE
{
	void rollNo();
}

class demo implements intfC, intfD
{
	public void name()
	{
		System.out.println("Sarvesh");
	}

	public void institute()
	{
		System.out.println("VESIT");
	}
	
	public void branch()
	{
		System.out.println("INFT");
	}

	public void division()
	{
		System.out.println("D10A");
	}

	public void rollNo()
	{
		System.out.println("46");
	}
}

public class Interface2 extends demo implements intfE
{
public static void main (String[] args)
	{
		demo ob1 = new demo();
		ob1.name();
		ob1.institute();
		ob1.branch();
		ob1.division();
		ob1.rollNo();
	}
}