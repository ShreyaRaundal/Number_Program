// A Harshad (Niven) number is a number that is divisible by the sum of its digits.
// Example: 18 → 1 + 8 = 9 → 18 is divisible by 9 → Harshad Number ✅
// Find the sum of digits, then check if the number is divisible by this sum.
// Example: 19 → 1 + 9 = 10 → 19 is not divisible by 10 → Not a Harshad Number ❌
import java.util.Scanner;
public class Harshad {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,p,rev,s=0;
        System.out.println("Enter the number:");
        n=sc.nextInt();
        p=n;
        while(n>0){
            rev=n%10;
            s=s+rev;
            n=n/10;
            if(p%s==0){
                System.out.println("The number is harshad Number:"+p);
            }else{
                System.out.println("Enter the number is not Harshad number"+p);
            }

        }
    }
}
