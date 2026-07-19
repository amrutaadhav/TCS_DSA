//sum of each digit raised to the power of total digits = original number like 1^3+5^3+3^3=153,407
import java.util.*;
public class armstrongNo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int temp=n,sum=0;
    while(n!=0){
      int digit =n%10;
      sum = sum + digit*digit*digit;
      n=n/10;
    }
    System.out.println(temp==sum ? "armstrong":"not armstrong");
    sc.close();
  }
  
}
