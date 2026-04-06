import java.io.*;
import java.util.*;

public class B1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] arr = new String[n + 1];
        Map<String, Integer> map = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            arr[i] = br.readLine();
            map.put(arr[i], i);
        }

        for (int i = 0; i < m; i++) {
            String s = br.readLine();
            
            if (Character.isDigit(s.charAt(0))) {
                sb.append(arr[Integer.parseInt(s)]).append("\n");
            } else {
                sb.append(map.get(s)).append("\n");
            }
        }        
        System.out.print(sb);
    }
}