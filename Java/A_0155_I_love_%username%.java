
import java.util.Scanner;

// name is I_love_%username%
public class I_love_username {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int min = 0;
        int max = 0;
        int c = 0;
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = scanner.nextInt();
            if (i == 0) {
                min = arr[i];
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
                c++;
            }
            if (arr[i] > max) {
                max = arr[i];
                c++;
            }
        }
        System.out.println(c);
    }
}

