// A bouncy number is one whose digits are neither entirely increasing nor decreasing.
// If a number is less than 100, it is not bouncy.
// Extract digits and check: if they increase at least once (a = 1) and decrease at least once (b = 1), it is bouncy.
// If digits only increase or only decrease, it is not bouncy.
// Example: 134468 (Not Bouncy), 987654 (Not Bouncy), 155349 (Bouncy). 

import java.util.*;
public class BouncyNo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n,a=0,b=0,p,d,sd;
        n=sc.nextInt();
        p=n;
        
        if(n < 100) { 
            System.out.println("The number is not a bouncy number : " + p);
            return;
        }
        
        while (n >= 10) { 
            d = n % 10;
            sd = (n / 10) % 10;
            n /= 10;
            
            if(d > sd) {
                a = 1; // Increasing sequence found
            }
            else if(d < sd) {
                b = 1; // Decreasing sequence found
            }
            
            if (a == 1 && b == 1) { 
                System.out.println("The Number is Bouncy number : " + p);
                return;
            }
        }
        
        System.out.println("The number is not a bouncy number : " + p);
    }
}
