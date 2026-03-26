import java.io.*;

public class B1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());

        int line = 1;
        int sum = 0;

        while (true) {
            if (x <= sum + line) {
                break;
            }
            sum += line;
            line++;
        }

        int pos = x - sum;

        if (line % 2 == 0) {
            System.out.println(pos + "/" + (line - pos + 1));
        } else {
            System.out.println((line - pos + 1) + "/" + pos);
        }
    }
}