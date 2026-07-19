import java.util.*;
public class tcs19 {
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    for (int i=0;i<n;i++){
      int count =0;
      for(int j=1;j<=arr[i];j++){
        if(arr[i]%j==0){
          count++;
        }
      }
    
      if(count==2){
        System.out.println("prime " +arr[i]);
      }else{
        System.out.println("not prime " + arr[i]);
      }
    }
    
    sc.close();
  }
}
