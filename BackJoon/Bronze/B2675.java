import java.io.*;
import java.util.*;

public class B2675 {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()); 

            int r = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            for (int j = 0; j < str.length(); j++) {
                for (int s = 0; s < r; s++) {
                    sb.append(str.charAt(j));
                }
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
} 