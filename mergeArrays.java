import java.util.*;
public class mergeArrays {
  
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
        int[] arr = new int[n1 + n2];

        for(int i = 0; i < n1; i++)
            arr[i] = sc.nextInt();

        for(int i = 0; i < n2; i++)
            arr[n1 + i] = sc.nextInt();

        for(int i = 0; i < arr.length; i++)
         System.out.print(arr[i] + " ");
        

          
          sc.close();
    }
}

