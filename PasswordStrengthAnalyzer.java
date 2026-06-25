import java.util.Scanner;

public class PasswordStrengthAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        int score = 0;

        // Length Check
        if (password.length() >= 8) {
            score++;
        }

        // Uppercase Check
        if (password.matches(".*[A-Z].*")) {
            score++;
        }

        // Lowercase Check
        if (password.matches(".*[a-z].*")) {
            score++;
        }

        // Number Check
        if (password.matches(".*[0-9].*")) {
            score++;
        }

        // Special Character Check
        if (password.matches(".*[!@#$%^&*()].*")) {
            score++;
        }

        System.out.println("\nPassword Analysis:");

        if (score <= 2) {
            System.out.println("Weak Password");
        } else if (score <= 4) {
            System.out.println("Medium Password");
        } else {
            System.out.println("Strong Password");
        }

        System.out.println("\nSuggestions:");

        if (password.length() < 8) {
            System.out.println("- Use at least 8 characters");
        }

        if (!password.matches(".*[A-Z].*")) {
            System.out.println("- Add uppercase letters");
        }

        if (!password.matches(".*[a-z].*")) {
            System.out.println("- Add lowercase letters");
        }

        if (!password.matches(".*[0-9].*")) {
            System.out.println("- Add numbers");
        }

        if (!password.matches(".*[!@#$%^&*()].*")) {
            System.out.println("- Add special characters");
        }

        sc.close();
    }
}