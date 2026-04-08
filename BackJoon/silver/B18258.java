import java.io.*;
import java.util.*;

public class B18258 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    q.add(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    if (q.isEmpty()) sb.append("-1\n");
                    else sb.append(q.poll()).append("\n");
                    break;
                case "size":
                    sb.append(q.size()).append("\n");
                    break;
                case "empty":
                    if (q.isEmpty()) sb.append("1\n");
                    else sb.append("0\n");
                    break;
                case "front":
                    if (q.isEmpty()) sb.append("-1\n");
                    else sb.append(q.peekFirst()).append("\n");
                    break;
                case "back":
                    if (q.isEmpty()) sb.append("-1\n");
                    else sb.append(q.peekLast()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
