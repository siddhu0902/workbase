import java.util.Scanner;

public class q48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bin;
        int dec = 0;
        int pos = 0;
        System.out.print("Enter a binary number: ");
        bin = sc.nextInt();
        for (; bin > 0; bin = bin / 10) {
            int digit = bin % 10;
            dec = dec + digit * (int) Math.pow(2, pos);
            pos++;
        }
        System.out.println("Decimal: " + dec);
    }
}
