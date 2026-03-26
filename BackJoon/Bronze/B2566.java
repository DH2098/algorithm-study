import java.io.*;
import java.util.*;

public class B2566 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = 0;
        int n = 1;
        int m = 1;
        
        for (int i = 1; i <= 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j<= 9; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num > max) {
                    max = num;
                    n = i;
                    m = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(n + " " + m);
    }
}
