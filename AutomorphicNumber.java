// An Automorphic Number is a number whose square ends with the same digits as the number itself.
// 5² = 25 → Ends with 5 ✅
// 76² = 5776 → Ends with 76 ✅
// 7² = 49 → Does NOT end with 7 ❌

import java.util.Scanner;
public class AutomorphicNumber {
    public static void main(String[] args) {
        int i,sqr,copy,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int n=sc.nextInt();
        sqr=n*n;
        copy=n;
        while (copy>0) {
            c++;
            copy=copy/10;
            
        }
        int end=sqr%(int)Math.pow(10,c);
        if(n==end){
            System.out.println("The number is Automorphic number:");
        }else{
            System.out.println("The number not a Automorphic number:");
        }
        
    }
    
}
