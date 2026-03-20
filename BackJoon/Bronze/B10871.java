import java.util.*;
import java.io.*;

public class B10871 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));      
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            int val = Integer.parseInt(st.nextToken());
            if (val < x) sb.append(val).append(" ");
        }
        System.out.print(sb);
    }
}