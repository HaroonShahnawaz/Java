import java.util.Scanner;

public class testdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Input number:");
		
		int num1= in.nextInt();
		
		for (int i=1; i<10; i++);
		{
			System.out.println(num1 + "x" +(i++) + "=" + (num1* (i++)));
		}
	}

}
