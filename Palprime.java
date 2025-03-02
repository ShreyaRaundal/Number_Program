// A Palprime is a number that is both a prime number (has only two factors: 1 and itself) and a palindrome
//  (reads the same forward and backward). Examples: 2, 3, 5, 7, 11, 101, 131, 151

import java.util.Scanner;
public class Palprime {
    public static void main(String[] args){
        int n,p,rev,s=0,c=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        n=sc.nextInt();
        p=n;
        for(int i=1;i<=p;i++){
            if(p%i==0){
                c++;
            }

        }
        while (n>0) {
            rev=n%10;
            s=s*10+rev;
            n=n/10;   
        }
        if(n==p && c==2){
            System.out.println("The number is palPrime :"+p);
        }else{
            System.out.println("The number is not a palPrime :"+p);
        }
    }
    
}
