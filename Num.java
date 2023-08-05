package Hello;
import java.util.Random;
import java.util.Scanner;  // Import the Scanner class
//Write a simple program to handle a minimum of 4 types of exceptions.(Nested Try)
public class Num {
public static void main(String[] args) {
	// create instance of Random class]
    Random rand = new Random();

    // Generate random integers in range 0 to 999
    int rand_int1 = rand.nextInt(100);
    int num= rand_int1;
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//    System.out.println("Enter a Number");
//
//    int userNum = myObj.nextInt();  // Read user input
//    System.out.println("Input Number is: " + userNum);  // Output user input

    int i = 0;
    while (i < 3) {
    	if(i!=0)
    	{
    		int g=3-i;
    	
      System.out.println("Guesses remaining "+ g);}
      i++;
    
    	Scanner Obj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Guess a Number");

        int user = Obj.nextInt();  // Read user input
        System.out.println("Input Number is: " + user);  // Output user input
    	if(rand_int1-user>0)
    	{
    		System.out.println("->Too low\n");
    	}
    	else if(rand_int1-user<0)   	
    	{
    		System.out.println("->Too high\n");
    	}
    	else
    	{
    		System.out.println("->Correct guess\n");
    	}
}
 // Print random integers
    System.out.println("Random Integer was: "+rand_int1);
}
}
