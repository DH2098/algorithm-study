import java.io.*;

public class B10988 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        
        System.out.println(input.equals(new StringBuilder(input).reverse().toString())? 1 : 0);
    }    
}
