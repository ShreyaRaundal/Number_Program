// An Armstrong number is a number that is equal to the sum of its own digits, each raised to the power of the number of digits. For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153. 
// Examples of Armstrong numbers: 
// 153, 370, 371, 407, 1634, 8208, and 9474.

import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args){
        int n,m,s=0,rev;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        m=n;
        while(n>0){
            rev=n%10;
            s=s+rev*rev*rev;
            n/=10;
        }
        if(s==m){
            System.out.println("The number is armstrong number"+m);
        }
        else{
            System.out.println("The number is not an armstrong number"+m);
        }
    }
    
}
