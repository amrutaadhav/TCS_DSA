//anagram means listen silent same word same character
import java.util.*;
public class anagram {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
  String str1 = sc.nextLine().toLowerCase();
  String str2 = sc.nextLine().toLowerCase();

  char [] a = str1.toCharArray();
  char [] b = str2.toCharArray();
  Arrays.sort(a);
  Arrays.sort(b);
  if(Arrays.equals(a,b)){
    System.out.println("anagram");
  }else{
    System.out.println("not anagram");
  }
    sc.close();
  }
  
}
