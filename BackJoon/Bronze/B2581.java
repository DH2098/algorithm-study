import java.io.*;
import java.util.*;

public class B2581 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        ArrayList<Integer> intArr = new ArrayList<>();
        int sum = 0;

        for (int i = n; i <= m; i++) {
            if (i < 2) continue;

            boolean isPrime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                intArr.add(i);
            }
        }

        for (int i : intArr) {
            sum += i;            
        }
        if (intArr.size() > 0) {
            System.out.println(sum);
            System.out.println(intArr.get(0));
        } else {
            System.out.println(-1);
        }        
    }
}
