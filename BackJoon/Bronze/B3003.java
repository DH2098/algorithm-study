import java.io.*;
import java.util.*;

public class B3003 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] pieces = {1, 1, 2, 2, 2, 8};
        
        for (int i = 0; i < pieces.length; i++) {
            System.out.print(pieces[i] - Integer.parseInt(st.nextToken()) + " ");
        }
    }
}
