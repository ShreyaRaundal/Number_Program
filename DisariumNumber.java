// Disarium Number in Java
// A Disarium Number is a number where the sum of its digits, each raised to the power of its position (1-based index), is equal to the number itself.
// Examples:
// ✅ 135 → 11+32+53=1+9+125=1351^1 + 3^2 + 5^3 = 1 + 9 + 125 = 13511+32+53=1+9+125=135 → Disarium Number
// ✅ 89 → 81+92=8+81=898^1 + 9^2 = 8 + 81 = 8981+92=8+81=89 → Disarium Number
// ❌ 123 → 11+22+33=1+4+27=321^1 + 2^2 + 3^3 = 1 + 4 + 27 = 3211+22+33=1+4+27=32 ≠ 123 → Not a Disarium Number
import java.util.Scanner;

public class DisariumNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        sc.close();

        int temp = n, sum = 0, len = String.valueOf(n).length();

        for (int i = len; temp > 0; i--) {
            int digit = temp % 10;  // Extract last digit
            sum += Math.pow(digit, i); // Raise to the power of its position
            temp /= 10;  // Remove last digit
        }

        if (sum == n) {
            System.out.println(n + " is a Disarium Number.");
        } else {
            System.out.println(n + " is NOT a Disarium Number.");
        }
    }
}
