import java.io.*;

public class B2941 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        String[] alphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        
        for (String alphabet : alphabets) {
            if (input.contains(alphabet)) {
                input = input.replace(alphabet, "*");
            } 
        }
        System.out.println(input.length());
    }
}
