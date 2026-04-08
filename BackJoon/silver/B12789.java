import java.io.*;
import java.util.*;

public class B12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        int now = 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == now) {
                now++;

                while (!stack.isEmpty() && stack.peek() == now) {
                    stack.pop();
                    now++;
                }
            } else { 
                stack.push(arr[i]);

                while (!stack.isEmpty() && stack.peek() == now) {
                    stack.pop();
                    now++;                    
                }
            }
        }

        if (now > n) {
            System.out.println("Nice");
        } else {
            System.out.println("Sad");
        }
    }
}
