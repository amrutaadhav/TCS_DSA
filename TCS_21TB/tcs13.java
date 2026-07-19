import java.util.*;
public class tcs13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String octal = " ";
    while(n > 0){
      octal = (n % 8) + octal;
      n=n/8;
    }
    System.out.println(octal);
    sc.close();
  }
  
}
