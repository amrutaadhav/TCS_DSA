import java.util.*;
public class largestThreeNo {
  
  public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();int b = sc.nextInt();int c = sc.nextInt();
      int max = Math.max(a,Math.max(b,c));
       System.out.print(max);
       sc.close();
}
  
}
