// A Sunny Number is a number where adding 1 to it results in a perfect square.
// Example:8 → 8 + 1 = 9 ✅ Sunny Number
// 10 → 10 + 1 = 11 (not a perfect square) → ❌ Not a Sunny Number

import java.util.Scanner;
public class SunnyNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,i,c=0,a;
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        for(i=0;i<=n;i++){
            a=(i*i)-1;
            if(a==c){
                c=1;
            }
        }
        if(c==1){
            System.out.println("the number is Sunny number "+n);
        }else{
            System.out.println("the number is not a sunny number "+n);
        }
    }
    
}
