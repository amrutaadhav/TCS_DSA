import java.util.Scanner;
public class checkSubstring {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine().toLowerCase();
    String sub = sc.nextLine().toLowerCase();
    if(str.contains(sub)){
      System.out.println("yes "+sub);
    }else{
      System.out.println("no");
    }
    sc.close();
  }
  
}
