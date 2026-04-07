import java.io.*;
import java.util.*;

public class B28278 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch (s) {
                case "1":
                    int x = Integer.parseInt(st.nextToken());
                    stack.push(x); 
                    break;
                case "2":
                    if (stack.isEmpty()) sb.append("-1\n");
                    else sb.append(stack.pop()).append("\n");
                    break;
                case "3":
                    sb.append(stack.size()).append("\n");
                    break;
                case "4":
                    if (stack.isEmpty()) sb.append("1\n");
                    else sb.append("0\n");
                    break;
                case "5":
                    if (stack.isEmpty()) sb.append("-1\n");
                    else sb.append(stack.peek()).append("\n");
                    break;
                }
        }
        System.out.println(sb);
    }
}
