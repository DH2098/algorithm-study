import java.util.*;
import java.io.*;

public class B10813 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        for (int index = 0; index < m; index++) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            int temp = arr[i-1]; 
            arr[i-1] = arr[j-1]; 
            arr[j-1] = temp; 
        }

        for (int i : arr) {
            sb.append(i + " ");
        }
        System.out.print(sb);
    }
}