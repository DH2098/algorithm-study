import java.io.*;
import java.util.*;

public class B2098 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = st.countTokens();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            StringBuffer sb = new StringBuffer(st.nextToken());
            String r = sb.reverse().toString();
            arr[i] = Integer.parseInt(r);
        }
        
        System.out.println(Arrays.stream(arr).max().getAsInt());
    }
}
