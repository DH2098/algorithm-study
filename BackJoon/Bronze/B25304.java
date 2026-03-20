import java.util.Scanner;

public class B25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int count = sc.nextInt();

        int each = 0;
        for (int i = 0; i < count; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            each += a * b;
        }
    String result = (total == each) ? "Yes" : "No";

    System.out.print(result);
    }
}