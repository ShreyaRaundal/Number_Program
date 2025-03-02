// A perfect number is a number whose proper divisors (excluding itself) sum up to the number.
// Example: 6 → Proper divisors: 1, 2, 3 → Sum = 1 + 2 + 3 = 6 (Perfect Number)

// Find and sum proper divisors, then check if the sum equals the original number.
// Example: 10 → Proper divisors: 1, 2, 5 → Sum = 1 + 2 + 5 = 8 (Not a Perfect Number)
import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, s = 0;
        
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        
        for(int i = 1; i <= n/2; i++){ // Loop only till n/2
            if(n % i == 0){
                s += i; // Sum of proper divisors
            }
        }
        
        if(s == n){
            System.out.println(n + " is a Perfect Number.");
        } else {
            System.out.println(n + " is not a Perfect Number.");
        }

        sc.close();
    }
}
