import java.util.*;
public class tcs8 {
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   String [] str = new String[n];
   for(int i=0;i<n;i++){
    str[i]=sc.next();
   }
   for(int i=0;i<n-1;i++){
    for(int j=i+1;j<n;j++){
      char a[] = str[i].toCharArray();
      char b[] =str[j].toCharArray();
      Arrays.sort(a);
      Arrays.sort(b);

      if(new String(a).equals(new String(b))){
        System.out.println(str[i] + " , " + str[j]);
      }
    }
   }

    sc.close();
  }
  
}
