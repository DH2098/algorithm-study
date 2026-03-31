import java.io.*;
import java.util.*;

public class B1978 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int count = 0;

        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(st.nextToken());
            
            boolean isPrime = true;

            if (m < 2) continue; 
            
            for (int j = 2; j < m; j++) {
                if (m % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) count++;
        }
        System.out.println(count);
    }
}