import java.io.*;
import java.util.*;

public class B18870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        
        int[] origin = new int[n];
        int[] sorted = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            origin[i] = sorted[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sorted);

        HashMap<Integer, Integer> map = new HashMap<>();
        int rank = 0;

        for (int i : sorted) {
            if (!map.containsKey(i)) {
                map.put(i, rank);
                rank++;
            }
        }
        
        for (int i : origin) {
            int j = map.get(i);
            sb.append(j).append(" ");
        }
        System.out.println(sb);
    
    }    
}
