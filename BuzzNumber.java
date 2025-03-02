// A Buzz Number is a number that either ends with 7 or is divisible by 7.
// Example: 27 → Ends with 7 → Buzz Number ✅
// Example: 21 → Divisible by 7 → Buzz Number ✅

// Check if a number ends with 7 (n % 10 == 7) or is divisible by 7 (n % 7 == 0).
// Example: 34 → Neither condition met → Not a Buzz Number ❌

import java.util.Scanner;
public class BuzzNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n;
        n=sc.nextInt();
        if(n%10==7 || n%7==0){
            System.out.println("The number is a Buzz Number " + n);
        }else{
            System.out.println("The number is not Buzz Number "+n);
        }
    }
    
}
