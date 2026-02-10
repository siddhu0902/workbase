import java.util.Scanner;

public class q55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oct, dec = 0, bin = 0;
        int pos = 0, place = 1;
        System.out.print("Enter an octal number: ");
        oct = sc.nextInt();
        while (oct > 0) {
            int digit = oct % 10;
            dec = dec + digit * (int) Math.pow(8, pos);
            pos++;
            oct = oct / 10;
        }
        while (dec > 0) {
            int rem = dec % 2;
            bin = rem * place + bin;
            place = place * 10;
            dec = dec / 2;
        }
        System.out.println("Binary: " + bin);
    }
}
