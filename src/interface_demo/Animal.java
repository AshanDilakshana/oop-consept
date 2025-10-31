package interface_demo;

// inteface cant extends can be imliment
// multiple inheritance can be use

public interface Animal  {
	
	
	void sleep();
	void eat();
	
	
	
	default void newmethode() {
		System.out.println("in default");
	}

	
	static void Staticmethode() {
		System.out.println("in static");
	}
}
