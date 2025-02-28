import java.util.Scanner;

public class KrishnamurtiNo {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,p,rev,f,i,s=0;
        System.out.println("Enter the Number :");
        n=sc.nextInt();
        p=n;
        while(n>0){
            rev=n%10;
            f=1;
            for(i=rev;i>=1;i--){
                f=f*i;
            }
            s=s+f;
            n=n/10;
        }
        if(p==s){
            System.out.println("The number is KrishnaMurthy Number : "+p);
        }
        else{
            System.out.println("The number is not  KrishnaMurthy Number :"+p);
        }


    }
}
