import java.util.*;
public class tcs6 {
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n<=0){
      System.out.println("invalid input");
    }
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print(i);
      if(j<i){
      System.out.print("*");
    }
  }
   System.out.println();  
  }

  for(int i=n;i>=1;i--){
    for(int j=1;j<=i;j++){
      System.out.print(i);
      if(j<i){
        System.out.print("*");
      }
    }
    System.out.println();
  }
  sc.close();
  }
}
