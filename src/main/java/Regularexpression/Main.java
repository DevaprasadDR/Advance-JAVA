package Regularexpression;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first name:");
        String firstName = scanner.nextLine();
        System.out.println("Please enter last name:");
        String lastName = scanner.nextLine();
        System.out.println("Please enter city:");
        String city = scanner.nextLine();
        System.out.println("Please enter state:");
        String state = scanner.nextLine();
        System.out.println("Please enter zip:");
        String zip = scanner.nextLine();


        System.out.println("\nValidate Result:");

        if (!validateFirstName(firstName))
            System.out.println("Invalid first name");
        else if (!validateLastName(lastName))
            System.out.println("Invalid last name");

        else if (!validateCity(city))
            System.out.println("Invalid city");
        else if (!validateState(state))
            System.out.println("Invalid state");
        else if (!validateZip(zip))
            System.out.println("Invalid zip code");

        else
            System.out.println("Valid input.  Thank you.");
    }

    public static boolean validateFirstName(String firstName) {
        return firstName.matches("[A-Z][a-zA-Z]*");
    }
    public static boolean validateLastName(String lastName) {
        return lastName.matches("[a-zA-z]+(['-][a-zA-Z]+)*");
    }

    public static boolean validateCity(String city) {
        return city.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }
    public static boolean validateState(String state) {
        return state.matches("([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)");
    }
    public static boolean validateZip(String zip) {
        return zip.matches("\\d{5}");
    }

    }

