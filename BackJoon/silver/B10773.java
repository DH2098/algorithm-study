import java.io.*;
import java.util.*;

public class B10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());

            switch (num) {
                case 0:
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                    break;
                default:
                    stack.push(num);
                    break;
            }
        }
        long l = 0;
        for (int i : stack) {
            l += i;
        }
        System.out.println(l);
    }
}
