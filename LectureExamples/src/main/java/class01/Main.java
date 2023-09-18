package class01;

// TODO: import Scanner from java.util
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* PRINTING TO THE CONSOLE */

        // TODO: Use System.out to print to the console
        System.out.println("Welcome to unit 2");


        /* DECLARING AND INITIALIZING VARIABLES */

        // TODO: Declare and initialize several variables and print them to the console
        String newFavShow = "Bones";
        String faveActor = "Bones and Booth";
        String faveFood = "Pizza";
        String faveColor = "Black";

        System.out.println("My new favorite show is " + newFavShow + " starring " + faveActor + ". My fav food is " + faveFood + " and my fav color is " + faveColor +"." );

        int niceRoundNumber = 7;
        double aDecNumber = 1.2345;
        double largeDecimalNumber = 1.23456789101112;
        System.out.println(niceRoundNumber);
        System.out.println(aDecNumber);
        System.out.println(largeDecimalNumber);

        boolean isEven = false;

        System.out.println(isEven);

        /* WRITING METHODS */

        // TODO: After coding your method below main(), call it here and print the result
        System.out.println(getFullName("Matt", "Mercer"));


        /* USING METHODS FROM OTHER CLASSES */

        // TODO: Call each of the static methods from the Examples class
        Examples.sayHello("Bob");

        System.out.println(Examples.addThreeNums(2,5,9));

        /* USING SCANNER TO GET USER INPUT */

        // TODO: Declare and initialize a Scanner object using System.in
        Scanner input = new Scanner(System.in);

        // TODO: Get user input
        // Precede your input with output to the user so they know what you need
        System.out.println("Enter a whole number: ");
        // Receive the input and store it in a variable
        int userNumber = input.nextInt();
        // Do something with the stored user input
        System.out.println("Your number is " + userNumber);
        // Always close the Scanner object at the end of the main method
        // for efficiency and security
        // TODO: Close Scanner
        input.close();
    }

    // TODO: Code a method to return a full name as a String using firstName and lastName
        public static String getFullName(String firstName, String lastName){
        return firstName + " " + lastName;
        }

}