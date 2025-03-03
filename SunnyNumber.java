// A Sunny Number is a number where adding 1 to it results in a perfect square.
// Example:8 → 8 + 1 = 9 ✅ Sunny Number
// 10 → 10 + 1 = 11 (not a perfect square) → ❌ Not a Sunny Number

import java.util.Scanner;

public class SunnyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        // Check if (n + 1) is a perfect square
        int num = n + 1;
        int sqrt = (int) Math.sqrt(num);

        if (sqrt * sqrt == num) {
            System.out.println(n + " is a Sunny Number.");
        } else {
            System.out.println(n + " is NOT a Sunny Number.");
        }
    }
}
