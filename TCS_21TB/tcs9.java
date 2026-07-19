import java.util.*;
public class tcs9 {
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String time = sc.next();
    String ampm = sc.next();

    String arr[] = time.split(":");
    int hh = Integer.parseInt(arr[0]);
    int mm = Integer.parseInt(arr[1]);
    int ss = Integer.parseInt(arr[2]);

    if(hh <= 12 && mm <= 59 && ss <= 59){
      if(ampm.equalsIgnoreCase("PM") && hh != 12){
          hh = hh + 12;
      }
      if(ampm.equalsIgnoreCase("AM") && hh==12){
        hh=0;
      }
      System.out.printf("%02d:%02d:%02d",hh,mm,ss);
    }else{
      System.out.println("invalid input");
    }
    sc.close();
  }
}
 