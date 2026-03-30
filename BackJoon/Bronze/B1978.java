import java.io.*;
import java.util.*;

public class B1978 {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            int m = Integer.parseInt(st.nextToken());

            if (m == 1) continue;
            
            for (int j = 2; j < m - 1; j++) {
                int check = 0;
                if (m % j == 0) {
                    continue;
                } 
                count += check;
            }
        }
        System.out.println(count);
    }
}