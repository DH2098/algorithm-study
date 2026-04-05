import java.io.*;
import java.util.*;

public class B1427 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        char[] arr = br.readLine().toCharArray();

        Arrays.sort(arr);

        for (char c : arr) {
            sb.insert(0, c);
        }
        System.out.println(sb);
    }    
}
