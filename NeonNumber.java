// A Neon Number is a number where the sum of the digits of its square equals the original number.
// Example:✅ 9 → 92=819^2 = 8192=81, 8+1=98 + 1 = 98+1=9 → Neon Number
// ❌ 12 → 122=14412^2 = 144122=144, 1+4+4=91 + 4 + 4 = 91+4+4=9 (≠ 12) → Not a Neon Number
// Neon Numbers in base-10: 0, 1, 9.

import java.util.Scanner;
public class NeonNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,s=0,p,rev;
        System.out.println("Enter the number:");
        n=sc.nextInt();
        p=n*n;
        while(p>0){
            rev=p%10;
            s=s+rev;
            p=p/10;
        }
        if(n==s){
            System.out.println(n+" is the Neon Number");
        }else{
            System.out.println(n+" is not the Neon Number");
        }
    }
    
}
