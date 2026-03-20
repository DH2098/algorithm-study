import java.util.Scanner;

public class B25314 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
    
        String result = "";
        for(int i = 0; i < num/4; i++) {
            result += "long ";
        }
        System.out.print(result + "int");    
    }
}