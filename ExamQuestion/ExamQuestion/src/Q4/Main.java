package Q4;

public class Main {

	public static void main(String[] args) {


		Vehical v1 = new Vehical("ABC123", "John Doe", "active");
		Vehical v2 = new Vehical("XYZ456", "Jane Smith", "inactive");
		Vehical v3 = new Vehical("LMN789", "Alex Brown", "active");
		
		
		
		System.out.println("Active Vehicles:\n");

        // display only active ones
        if (v1.getStatus().equals("active")) {
            v1.displayDetails();
        }
        if (v2.getStatus().equals("active")) {
            v2.displayDetails();
        }
        if (v3.getStatus().equals("active")) {
            v3.displayDetails();
        }
        
		
	}
	
	

}
