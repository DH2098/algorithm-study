import java.io.*;
import java.util.*;

public class B1269 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int count = 0;

        Map <Integer, Integer> aMap = new HashMap<>();
        Map <Integer, Integer> bMap = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < a; i++) {
            int t = Integer.parseInt(st.nextToken());
            aMap.put(t, i);
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < b; i++) {
            int t = Integer.parseInt(st.nextToken());
            bMap.put(t, i);
        }
        for (int i : aMap.keySet()) {
            if (bMap.get(i) == null) {
                count++;
            }
        }
        for (int i : bMap.keySet()) {
            if (aMap.get(i) == null) {
                count++;
            }
        }
        System.out.println(count);
    }
}
