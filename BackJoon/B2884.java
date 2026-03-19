import java.util.Scanner;

public class B2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();

        if (m < 45) {
            if (h == 0) {
                h = 23;
            } else {
                h--;
            }
            System.out.print(h + " " + (15 + m));
        } else {
            System.out.print(h + " " + (m - 45));
        }
    }

}