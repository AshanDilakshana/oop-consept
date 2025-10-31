package Polymorphism;


class Bike {
	void run() {
		System.out.println("bike is running");
	}
	
}


class Yamaha extends Bike{
	void run() {
		System.out.println("yamha bike is running");
	}
}
	
	
	
	
	
	
	
public class main {	

public static void main(String[] args) {
		  
		Bike b1 =new Yamaha(); //upcasting
		b1.run();
		
	}

}
