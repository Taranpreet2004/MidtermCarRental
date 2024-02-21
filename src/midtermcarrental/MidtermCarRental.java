/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package midtermcarrental;


/**
 * A class that models a car rental portal.
 * Users can sign up to rent a car but must meet minimum 
 * requirements in order to rent the car.
 * Do not worry about the functionality (it does not have full functionality)
 * Only worry about the design for the exam.
 * @author dancye, 2023
 * @modifier Taranpreet Singh
 */
import java.util.Scanner;

public class MidtermCarRental {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Software Fundamentals Car Rental System");
        System.out.println("Please enter the following questions to proceed with creating an account:");
        System.out.println("Please enter your last name: ");
        String lastName = sc.nextLine();
        System.out.println("Please enter your first name: ");
        String firstName = sc.nextLine();
        System.out.println("Please enter your year of birth:");
        int birthYear = sc.nextInt();
        sc.nextLine(); // Consume the newline left-over
        System.out.println("Please select your customer type:");
        for (int i = 0; i < Customer.customerTypes.length; i++) {
            System.out.println((i + 1) + ". " + Customer.customerTypes[i]);
        }
        int customerTypeIndex = sc.nextInt();
        boolean insurance = false;
        if (customerTypeIndex == 1) {
            System.out.println("Do you have insurance? (yes/no)");
            String insuranceResponse = sc.nextLine();
            if (insuranceResponse.equalsIgnoreCase("yes")) {
                insurance = true;
            }
        }
        Customer customer = new Customer(lastName, firstName, birthYear);
        customer.setInsurance(insurance);
        if (!customer.isEligibleToRent()) {
            System.out.println("I'm sorry but you must be at least 21 in order to create an account");
        } else {
            System.out.println("Account created, let's get a car for you...");
        }
    }
}
