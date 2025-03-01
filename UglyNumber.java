// Ugly numbers have only 2, 3, and 5 as prime factors.
// Start from 1, which is considered an Ugly Number.
// Keep dividing by 2, 3, or 5 until 1 is reached.
// If any other factor appears, the number is NOT ugly.
// Example: 10 → 10/2 = 5, 5/5 = 1 (Ugly ✅) but 14 → 14/2 = 7 (Not Ugly ❌).

import java.security.Signature;
import java.util.Scanner;
public class UglyNumber {
    static boolean isUgly(int n){
        if(n<=0) return false;

        while(n%2==0)n/=2;
        while(n%3==0)n/=3;
        while(n%5==0)n/=5;

        return (n==1);

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the number:");
        int num=sc.nextInt();

        if(isUgly(num)){
            System.out.println(num+" the number is Uglu Number");
        }
        else{
            System.out.println(num+" the number is not Ugly number");
        }
    }
}
