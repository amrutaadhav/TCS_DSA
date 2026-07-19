//palindrome means 121 same output 121 
import java.util.*;
public class palimdromeNo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int temp=n,rev = 0;
    while(n!=0){
      rev = rev*10 + n%10;
      n=n/10;
    }
    System.out.println(temp==rev ? "palindrome":"not palindrome");
    sc.close();
  }
  
}
