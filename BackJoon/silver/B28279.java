import java.io.*;
import java.util.*;

public class B28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Deque<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());

            switch (command) {
                case 1:
                    q.addFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    q.addLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    if (q.isEmpty()) sb.append("-1\n");
                    else sb.append(q.pollFirst()).append("\n");
                    break;
                case 4:
                    if (q.isEmpty()) sb.append("-1\n");
                    else sb.append(q.pollLast()).append("\n");
                    break;
                case 5:
                    sb.append(q.size()).append("\n");
                    break;
                case 6:
                    if (q.isEmpty()) sb.append("1\n");
                    else sb.append("0\n");
                    break;
                case 7:
                    if (!q.isEmpty()) sb.append(q.peekFirst()).append("\n");
                    else sb.append("-1\n");
                    break;
                case 8:
                    if (!q.isEmpty()) sb.append(q.peekLast()).append("\n");
                    else sb.append("-1\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
