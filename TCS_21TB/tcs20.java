import java.util.*;
public class tcs20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int l = Integer.MIN_VALUE;int sl = Integer.MIN_VALUE; int tl = Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
      if(arr[i]>l){
        tl=sl;
        sl=l;
        l = arr[i];
      }else if(arr[i]>sl && arr[i] != l){
         tl = sl;
         sl=arr[i];
      }else if(arr[i]>tl && arr[i] != sl){
        tl = arr[i];
      }
     
    }
    System.out.println(tl);
    sc.close();
  }
}
