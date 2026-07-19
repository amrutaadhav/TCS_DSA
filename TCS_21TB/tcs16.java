import java.util.*;
public class tcs16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String ip = sc.nextLine();
    String arr[] = ip.split("\\.");

    if(arr.length != 4){
      System.out.print("invalid");
      return;
    }
    boolean valid = true;
    for(int i=0;i<4;i++){
      int num = Integer.parseInt(arr[i]);
      if(num<0 || num >255){
        valid = false;
        break;
      }
    }
      if(!valid){
        System.out.print("invalid");
      }else{
        System.out.print("valid");
      }

    
  sc.close();
  }
  
}
