//check the number is prime or not
import java.util.*;
public class primeNo {
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean prime = true;

    if(n<=1){
      prime = false;
    }
    for(int i=2; i<n; i++){
      if(n%i==0){
        prime = false;
        break;
      }

    }
    System.err.println(prime ? "prime":"not prime");
    sc.close();
  }
  
}
