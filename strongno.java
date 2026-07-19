
import java.util.*;

public class strongno {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;
        int original = n;

        while(n>0){
        int fact=1;
        int digit = n%10;
        
        for(int i=1;i<=digit;i++){
           
            fact = fact*i;
            
        }
        sum=sum+fact;
        n/=10;
    }
    System.out.println(sum==original ? "strong" : "not strong");
    sc.close();
    }
}