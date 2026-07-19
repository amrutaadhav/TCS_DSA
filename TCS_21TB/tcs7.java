import java.util.*;
public class tcs7 {
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    boolean found =false;
    if(n1<0 || n2<0){
      System.out.print("invalid input");
      return;
      
    }
    for(int i=n1;i<=n2;i++){
      if(i<100){
        continue;
      }
      int num = i;
      int sum = 0;
      while(num>0){
         int digit = num %10;
         sum = sum + digit*digit*digit;
         num=num/10;
      }
      
      if(sum==i){
      System.out.print(i + " ");
      found = true;
      }
}
if(!found){
  System.out.print("not found");
}
sc.close();
}
  
}
