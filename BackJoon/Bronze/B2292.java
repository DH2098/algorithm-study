import java.io.*;

public interface B2292 {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int s = 1; 
        int x = 1; 

        if (n == 1) {
            System.out.println(1);
            return;
        } else {
            while (true) {
                if (n <= s) {
                    System.out.println(x);
                    break;
                } else {
                    s += 6 * x;
                    x++;
                }
            }

        }
    }
}
