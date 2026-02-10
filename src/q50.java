import java.util.Scanner;

public class q50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, x, y, hcf, lcm;
        System.out.print("Enter first number: ");
        a = sc.nextInt();
        System.out.print("Enter second number: ");
        b = sc.nextInt();
        x = a;
        y = b;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        hcf = x;
        lcm = (a * b) / hcf;
        System.out.println("LCM: " + lcm);
    }
}
