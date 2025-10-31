package Q4;

public class Vehical {
	
	private String registrationNumber;
    private String ownerName;
    private String status;
    
    
    
	public Vehical(String registrationNumber, String ownerName, String status) {
		super();
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.status = status;
	}



	public String getRegistrationNumber() {
		return registrationNumber;
	}



	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}



	public String getOwnerName() {
		return ownerName;
	}



	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	// Display details method
    public void displayDetails() {
        System.out.println("Registration Number: " + getRegistrationNumber());
        System.out.println("Owner Name: " + getOwnerName());
        System.out.println("-----------------------------------");
    }

}
