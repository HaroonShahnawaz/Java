package Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int a=1,2,3,3,4,4,5,5,6,6,7,7,;
		
		//array: arrays is a collection of elements of the same data type
		//2 type of arrays
		//1)Sing dimensional
		//2)two/multi dimensional
		
		
	//single dimensional arrays
		// 1)Declare an array
		// 2) Insert values into arrays
		// 3)find size of an arrays
		// 4)read values from an arrays
		
		// 1) Declare an array
		
		int a[]=new int[5]; // declared arrays with size 10, starting index is 0, last index is 9
		
		// 2) Insert values into arrays
		
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
			
		// 3) Find size of an arrays
		
		System.out.println("Length of an arrray : "+a.length); //Print length of an array
		
		// 4) Read values from an arrays
		
		System.out.println(a[2]);
		
		for(int i=0; i<=a.length-1; i++)
		{
			System.out.println(a[i]);
		}
		
		
	}

}
