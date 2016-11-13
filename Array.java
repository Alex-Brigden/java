package college_HW;

import java.util.*;

public class Array {
	
	// creates array of length 4 
	static int[] a = new int[4];

	public static void main(String[] args) {
		int sum = 0; // Initializes integer value for sum of all inputs
		int sum10 = 0; // Initializes integer value for sum of inputs greater than 10
		int count = 0; // Initializes integer value for number of inputs greater than 10
		int count2 = 0; // Initializes integer value for number of inputs greater than the previous one
		double av; // Integer value for average of all inputs
		double av10; // Integer value for average of inputs greater than 10
		int k; // Integer value for comparison with the values in the array
		
		Scanner st = new Scanner(System.in);
		Scanner sk = new Scanner(System.in);
		
		//displays prompt for user to enter a value to add to the array
		for (int i = 0; i<4; i++){
			System.out.println("Enter an integer: ");
			int x = st.nextInt();
			a[i] = x;
			
			// calculates the sum of values greater than 10 and counts them 	
			if (x>10){
				sum10 = sum10 + x;
				count++;
			}
				
		}
		
		// calculates sum of all values in the array
		for (int i = 0; i<4; i++){
			sum = sum + a[i];
		}
		
		// calculates average of all values in the array
		av = sum / 4.0;	
		
		// calculates average of values greater than 10
		av10 = sum10 / count;
		
		// prompts user to enter a number to compare with the values previously entered in the array
		System.out.println("Enter a last number: ");
        k = sk.nextInt();
        for (int i=0; i<4; i++)
        {
       
        if (k > a[i])
            count2++;
        }
		
		System.out.println("The sum of all values is: " + sum);
		System.out.println("The average of all values is: " + av);
		System.out.println("The sum of values greater than 10 is: " + sum10);
		System.out.println("The average of values greater than10 is: " + av10);
		System.out.println("The number of values greater than 10 is: " + count);
		System.out.println("The number of values in the array less than last one entered is: " + count2);



		

	}

}

