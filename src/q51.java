import java.util.Scanner;

public class q51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bin;
        int dec = 0;
        int pos = 0;
        System.out.print("Enter a binary number: ");
        bin = sc.nextInt();
        while (bin > 0) {
            int digit = bin % 10;
            dec = dec + digit * (int) Math.pow(2, pos);
            pos++;
            bin = bin / 10;
        }
        System.out.println("Decimal: " + dec);
    }
}
