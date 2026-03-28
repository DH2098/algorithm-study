import java.io.*;

public class B1316 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String input = br.readLine();
        if (input == null) return;

        int n = Integer.parseInt(input);
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            if (isGroupWord()) {
                count++;
            }
        }
        System.out.println(count);
    }    

    public static boolean isGroupWord() throws IOException {
        boolean[] visited = new boolean[26];
        String s = br.readLine();

        int prev = 0;

        for (int i = 0; i < s.length(); i++) {
            int now = s.charAt(i);

            if (prev != now) {
                if (visited[now - 'a']) {
                    return false;
                } else {
                    visited[now - 'a'] = true;
                    prev = now;
                }
            }
        }
        return true;
    }
}