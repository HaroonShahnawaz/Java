package overloading;

public class methodoverloading {

	//method overloading is a feature that allows a class to have more than one moethod having the same name
	
	void add (int a,int b)
	{
		System.out.println(a+b);
	}
	void add (int a, double b)
	{
		System.out.println(a+b);
	}
	void add (double a,double b)
	{
		System.out.println(a+b);
	}
	void add (int a,int b, int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		methodoverloading mo=new methodoverloading();
		
		mo.add(10,20);
		mo.add(10,20.0);
		mo.add(10.0, 2.0);
		mo.add(10, 20, 3);
		
		
	}

}
