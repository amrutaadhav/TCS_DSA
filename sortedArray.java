//check if array is sorted
import java.util.*;
public class sortedArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int []arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();

    }
    boolean sorted = true;
    for(int i=0;i<n-1;i++){
      if(arr[i]>arr[i+1]){
        sorted=false;
        break;
      }
     
    }
     System.out.println(sorted ? "sorted":"not sorted");
    sc.close();
  }
  
}
