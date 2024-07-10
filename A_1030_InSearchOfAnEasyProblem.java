import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i;
        while (n > 0) {
            i = scanner.nextInt();
            if (i == 1) {
                System.out.println("HARD");
                return;
            }
            n--;
        }
        System.out.println("EASY");
    }
}
