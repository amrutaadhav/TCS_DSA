import java.util.*;
public class tcs5 {
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b =sc.nextInt();
    if(a<=0 || b<=0){
      System.out.print("invalid input");
    }
    while(b != 0){
      int temp =b;
      b = a % b;
      a=temp;
    }
    System.out.println(a);
    sc.close();
  }
}
