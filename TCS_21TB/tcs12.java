import java.util.*;
public class tcs12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextInt();
    long fact = 1;
  
      for(long i=1;i<=n;i++){
      fact = fact*i;
      }
    
    System.out.println(fact);
    sc.close();
  }
}
