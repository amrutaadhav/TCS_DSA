import java.util.*;
public class tcs17 {
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String arr[] = str.trim().split("\\s+");
    System.out.print(arr.length);
    sc.close();
  }
}
