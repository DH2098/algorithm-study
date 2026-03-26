import java.io.*;
import java.util.*;

public class B2745 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        int n = Integer.parseInt(st.nextToken());

        int power = 0;
        long sum = 0;
    
        for (int i = s.length() - 1; i >= 0 ; i--) {
            char c = s.charAt(i);
            int num;

            if (c >= 'A' && c <= 'z') {
                num = c - 'A' + 10;
            } else {
                num = c - '0';
            }
            sum += num * Math.pow(n, power++);
        }
        System.out.println(sum);
    }
}
