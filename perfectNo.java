//sum of all proper divisors = the number itself 6,28

import java.util.*;

public class perfectNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum = sum + i;
            }
        }
        System.out.println(sum==n ? "strong" : "not strong");
        sc.close();



    }
}