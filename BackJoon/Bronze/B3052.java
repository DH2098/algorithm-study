import java.io.*;
import java.util.*;

public class B3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Integer[] arr = new Integer[10];
        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[i] = n % 42;
        }
        
        Set<Integer> set = new HashSet<>(Arrays.asList(arr));
        System.out.print(set.size());
    }
}