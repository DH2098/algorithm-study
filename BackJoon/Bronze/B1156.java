import java.io.*;

public class B1156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine().toUpperCase();

        int[] count = new int[26];

        for (int i = 0; i < input.length(); i++) {
            count[input.charAt((i)) - 'A']++;
        }

        int max = -1;
        char result = '?';

        for (int i = 0; i < count.length; i++) {
            if (count[i] > max) {
                max = count[i];
                result = (char) (i + 'A');
            } else if (count[i] == max) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}
