import java.util.*;
public class incrementDecrement {
    public static void main(String[] args){
        int n,p,a=0,b=0,x=0,y=0,d,sd;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Increment and Decrement number: ");
        n=sc.nextInt();
        p=n;
        while(n>9){
            d=n%10;
            sd=(n%100)/10;
            n=n/10;
            if(((d>sd)||d==sd) && b==0 && y==0){  
                a=1;
                x=1;
                continue;
            }
            else if(((d<sd) ||d==sd) && a==0 && b==0){
                b=1;
                y=1;
                continue;
            }else{
                a=2;
                b=2;
                break;
            }
        }
        if(a==1){
          System.out.println("The number is increament number:"+p);
        }
        else if(b==1){
            System.out.println("the number is decrement number:"+p);
        }
        else{
            System.out.println("The number is not increment and decreament number :"+p);
        }
    }
    
}
