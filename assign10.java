import java.util.*;
public class assign10 {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();

      int i = 1;
      while(i<=n){
        if ( i % 2 != 0){
            i++;
            continue;
        }
        System.out.println(i);
        i++;
      }
    }
}

