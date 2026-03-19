import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int interval = sc.nextInt();

        int addedMinutes = m + interval;
        int addedHour = h + (addedMinutes / 60);

        if (addedHour >= 24) {
            h = addedHour - 24;
        } else {
            h += addedMinutes / 60;
        }
        m = addedMinutes - (addedMinutes / 60) * 60;

        System.out.println(h + " " + m);
    }
}