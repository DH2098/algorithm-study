import java.util.Scanner;

public class B1330 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String output = "";

        if (a < b) {
            output = "<";
        } else if (a > b) {
            output = ">";
        } else if (a == b) {
            output = "==";
        }
        System.out.println(output);
    }
}
