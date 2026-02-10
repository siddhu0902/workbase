import java.util.Scanner;

public class q47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int bin = 0;
        int place = 1;
        System.out.print("Enter a decimal number: ");
        num = sc.nextInt();
        while (num > 0) {
            int rem = num % 2;
            bin = rem * place + bin;
            place = place * 10;
            num = num / 2;
        }
        System.out.println("Binary: " + bin);
    }
}
