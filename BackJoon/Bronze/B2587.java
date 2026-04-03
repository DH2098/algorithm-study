import java.io.*;
import java.util.*;

public class B2587 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 5; i++) { 
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);
        for (int i : list) {
            sum += i;
        }
        System.out.println(sum / 5);
        System.out.println(list.get(2));
    }
}
