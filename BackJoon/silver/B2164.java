import java.io.*;
import java.util.*;

public class B2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        if (n == 1) {
            System.out.println(1);
            return;
        }

        Deque<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            q.add(i + 1);
        }

        while (q.size() > 1) {
            q.pollFirst();

            if (q.size() == 1) break;

            q.addLast(q.pollFirst());
        }
        System.out.println(q.peek());
    }
}
