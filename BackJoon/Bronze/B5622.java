import java.io.*;

public class B5622 {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String dial = "ABC DEF GHI JKL MNO PQRS TUV WXYZ";
        String[] dials = dial.split(" ");

        int result = 0; 
        
        String[] strArray = br.readLine().split("");
        int n = strArray.length;

        for (int i = 0; i < dials.length; i++) {
            for (int j = 0; j < n; j++) {
                if (dials[i].contains(strArray[j])) {
                    result += 3 + i;
                }
            }
        }
        System.out.println(result);

    }
}
