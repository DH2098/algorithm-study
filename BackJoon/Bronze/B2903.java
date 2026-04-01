import java.io.*;

public class B2903 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int base = 3;
        for (int i = 1; i < n; i++) {
            base += Math.pow(2, i);
        }
        System.out.println(base * base);
    }   
}