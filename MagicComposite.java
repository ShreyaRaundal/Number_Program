import java.util.Scanner;
public class MagicComposite {
    static boolean isComposite(int n){
        if(n<4)return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)return true;
        }
        return false;
    }
    static boolean isMagic(int n){
        while(n>9){
            int sum=0;
            while(n>0){
                sum+=n%10;
                n/=10;
            }
            n=sum;
        }
        return(n==1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();
    
        if(isComposite(num)&& isMagic(num)){
            System.out.println(num+"is a Magic Number1:");
        }
        else{
            System.out.println(num+"is NOT a magic composite Number :");
        }
    }
    
}
