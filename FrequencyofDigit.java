import java.util.Scanner;

public class FrequencyofDigit {
    public static void main(String[] args) {
        int n, p, dig, i;
        int[] digit = new int[10]; // Array to store frequency of digits
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number:");
        n = sc.nextInt();  // Read the number from user input
        p = n; // Assign the original number to p
        
        // Initialize the frequency array to 0
        for (i = 0; i < 10; i++) {
            digit[i] = 0;
        }
        
        // Count the frequency of each digit
        while (n > 0) {
            dig = n % 10;  // Get the last digit of the number
            digit[dig]++;  // Increment the frequency of the digit
            n = n / 10;    // Remove the last digit from n
        }
        
        // Print the original number
        System.out.println("Original number: " + p);
        
        // Display the frequency of each digit
        for (i = 0; i <= 9; i++) {
            if (digit[i] != 0) {  // Only print digits that appear in the number
                System.out.println("Frequency of " + i + " is " + digit[i]);
            }
        }
    }
}
