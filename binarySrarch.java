import java.util.*;
public class binarySrarch {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[]arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    int key=sc.nextInt();
    int found=-1;
    int low=0, high=n-1;
    Arrays.sort(arr);

    while(low<=high){
       int mid = low + (high - low) / 2;
      if(arr[mid]==key){
        found=mid;
        break;
      }else if(key<arr[mid]){
        high=mid-1;
      }else{
        low=mid+1;
      }
    }
    if(found != -1) {
      System.err.println("key found"+key);
  }else{
    System.out.println("key not found");
  }
  sc.close();
}
}
