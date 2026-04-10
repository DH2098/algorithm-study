import java.io.*;
import java.util.*;

public class B10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        
        HashSet<String> set = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            set.add(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        
        st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < m; i++) {
            
            if (set.contains(st.nextToken())) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }

        System.out.println(sb);
    }
}