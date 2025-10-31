package Q2;

import java.util.ArrayList;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
    	
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter numbers (enter 0 to stop):");

        // a) Take input and store in array
        while (true) {
            int num = input.nextInt();
              if (num == 0) {
                  break;
             }
              else if (num%2 != 0) {         // b
				numbers.add(num);
			}
             
            
        }
        
           

        // b) Remove even numbers
       // numbers.removeIf(n -> n % 2 == 0);

        
        
        // c) Display remaining odd numbers
        System.out.println("Odd numbers in the array:");
        
        for (int n : numbers) {
            System.out.println(n);
        }

        input.close();
    }
}
