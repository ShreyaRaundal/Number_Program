// A Duck Number is a number that contains at least one '0' in it, but not as the first digit.
// Examples: ✅ 3210 → Duck Number (contains '0' but not at the start)
// ✅ 705 → Duck Number (contains '0')
// ❌ 0123 → Not a Duck Number (starts with '0')
// ❌ 123 → Not a Duck Number (no '0' present)

import java.util.Scanner;
public class DuckNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        String num=sc.next();

        boolean isDuck=false;

        if(num.charAt(0)!='0'){
            System.out.println("The number is not a duck number");
            for(int i=0;i<num.length();i++){
                if(num.charAt(i)=='0'){
                    isDuck=true;
                    break;
                }
            }

        }
        if(isDuck){
            System.out.println(num+"the number is duck number");
        }else{
            System.out.println(num+"the number is not a duck number");
        }

    }
    
}
