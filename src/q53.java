import java.util.Scanner;

public class q53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oct;
        int dec = 0;
        int pos = 0;
        System.out.print("Enter an octal number: ");
        oct = sc.nextInt();
        while (oct > 0) {
            int digit = oct % 10;
            dec = dec + digit * (int) Math.pow(8, pos);
            pos++;
            oct = oct / 10;
        }
        System.out.println("Decimal: " + dec);
    }
}
