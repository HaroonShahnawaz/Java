package oops;

public class Tesla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Teslamain veh1=new Teslamain();
          Teslamain veh2=new Teslamain();
                    
          veh1.vin=12345678;
          veh1.Model="Model X";
          veh1.price=35000.00;
          veh1.category="SUV";
          veh1.year="2020";
		  veh1.display();
		  
		  veh2.vin=87654321;
          veh2.Model="Model S";
          veh2.price=25000.00;
          veh2.category="Coupe";
          veh2.year="2019";
		  veh2.display();
	}

}
