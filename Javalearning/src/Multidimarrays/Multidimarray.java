package Multidimarrays;

public class Multidimarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	int a[][]= {{100,200},{300,400},{500,600}};
		
		
		System.out.println("Number of Rows:" + a.length);
		System.out.println("Number of Columns:" + a[0].length);
		
		
		//enhanced for loop
		
		for (int r[]:a)
			
		{
			for(int i:r)
		{System.out.println(i);
		}
		}
		
	}

}
