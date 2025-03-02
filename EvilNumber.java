// Evil Number is a number whose binary representation contains an even number of 1s.
// Example: 9 → Binary: 1001 (2 ones, even ✅) → Evil Number, but 7 → Binary: 111 (3 ones, odd ❌) → Not an Evil Number.
import java.util.Scanner;
public class EvilNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=sc.nextInt();
        int count=0;
        int temp=num;

        while(temp>0){
            count +=temp%2;
            temp/=2;
        }
        
        if(num%2==0){
            System.out.println("The number is Evil number");
            
        }else{
            System.out.println("The number is not Evil number");
        }
    }
    
}
