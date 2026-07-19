import java.util.*;
public class tcs15 {
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int e1 = sc.nextInt();
    int e2 = sc.nextInt();
    int idx1=-1; int idx2=-1;
    for(int i=0;i<n;i++){
      if(arr[i]==e1){
        idx1=i;
      }
      if(arr[i]==e2){
        idx2=i;
      }
    }
    System.out.println("index of e1:"+ idx1);
    System.out.println("index of e2:" + idx2);
    sc.close();
  }

}
