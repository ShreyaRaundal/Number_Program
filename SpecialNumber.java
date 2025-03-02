// A Special Number is a number where the sum of the factorials of its digits equals the number itself.
// Example:145 → 1! + 4! + 5! = 1 + 24 + 120 = 145 ✅
// Other Special Numbers: 1, 2, 145

import java.util.Scanner;

public class SpecialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, num, sum, s = 0, temp;

        System.out.println("Enter the number:");
        n = sc.nextInt();
        temp = n; 

        while (n > 0) {
            num = n % 10; // Extract last digit
            sum = 1; // Initialize sum for factorial calculation
            
            for (i = num; i > 0; i--) { 
                sum *= i; // Compute factorial
            }

            s += sum; // Add factorial to sum
            n /= 10;  // Remove last digit
        }

        if (s == temp) {
            System.out.println("The number is a Special Number: " + temp);
        } else {
            System.out.println("The number is not a Special Number: " + temp);
        }
    }
}
