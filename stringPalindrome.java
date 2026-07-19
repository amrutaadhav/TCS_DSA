import java.util.Scanner;
public class stringPalindrome {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    String rev = "";
    for(int i=str.length()-1;i>=0;i--){
     rev = rev+str.charAt(i);
    }
    System.out.println(str.equals(rev) ? "palindrome" : "not palindrome");
    sc.close();
  }
  
}
