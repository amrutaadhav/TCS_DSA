//remove all spaces from string
import java.util.*;
public class RemoveAllSpaces {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    str = str.replaceAll("\s+","");
  
    System.out.println(str);
    sc.close();
  }
  
}
