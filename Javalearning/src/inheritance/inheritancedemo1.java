package inheritance;

class A //Parent class

{
	int a;
	
	void display()
	{
		System.out.println(a);
		
	}
}

class B extends A //B is class, A is parent Class
{
int b;
void print()

{
	System.out.println(b);
}
}

public class inheritancedemo1 {

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
A aobj=new A();

aobj.a=100;
aobj.display();

B bobj=new B();
bobj.b=200;
bobj.a=100;

bobj.display();
bobj.print();


		
		
	}

}
