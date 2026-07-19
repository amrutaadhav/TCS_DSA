//a aani b number asel tr lcm hi a*b/gcd aste
import java.util.*;
public class lcm {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int a=x,b=y;
    while(b!=0){
      int temp = b;
      b = a % b;
      a = temp;
    }
    int gcd = a;
    int lcm = x*y/gcd;
    System.out.println(lcm);
    sc.close();
  }
}
