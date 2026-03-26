import java.io.*;

public class B2720 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int money = Integer.parseInt(br.readLine());

            int quarter = money / 25;
            money %= 25;

            int dime = money / 10;
            money %= 10;

            int nickel = money / 5;
            money %= 5;

            int penny = money;

            sb.append(quarter).append(" ")
                .append(dime).append(" ")  
                .append(nickel).append(" ")
                .append(penny).append("\n");
        }

        System.out.println(sb);
    }
}
