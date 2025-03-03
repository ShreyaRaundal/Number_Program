// A Palindrome Number is a number that reads the same forward and backward.
// Examples:✅ 121 → Palindrome (same forward & backward)
// ✅ 12321 → Palindrome
// ❌ 123 → Not a Palindrome

import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,p,rev,s=0;
        System.out.println("Enter the number:");
        n=sc.nextInt();
        p=n;
        while(n>0){
            rev=n%10;
            s=s*10+rev;
            n=n/10;
        }
        if(p==s){
            System.out.println(p +" is the palindrome number");
        }else{
            System.out.println(p +" is not the palindrome number");
        }
    }
    
}
