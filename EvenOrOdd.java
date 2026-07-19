//check even or odd number
import java.util.*;
class EvenOrOdd{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n%2==0){
      System.out.print("even");
    }
    else{
      System.out.println("odd");
    }
    sc.close();
  }
  
}