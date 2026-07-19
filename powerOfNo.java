import java.util.*;
public class powerOfNo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int result = 1;
    for(int i=0;i<n;i++){
    result = result*n;
    }
    System.out.println(result);

    sc.close();
  }
}
