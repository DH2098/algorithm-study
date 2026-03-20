import java.io.*;
import java.util.*;

public class B10810 {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
    
        int[] arr = new int[n];
    
        for (int t = 0; t < m; t++) {
            st = new StringTokenizer(br.readLine());
    
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            
            for (int index = i-1; index < j; index++) {
                arr[index] = k;
            }
        }

        for (int i : arr) {
            sb.append(i + " ");
        }
        System.out.print(sb);
    }
}