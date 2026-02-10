import java.util.Scanner;

public class q54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bin, dec = 0, oct = 0;
        int pos = 0, place = 1;
        System.out.print("Enter a binary number: ");
        bin = sc.nextInt();
        while (bin > 0) {
            int digit = bin % 10;
            dec = dec + digit * (int) Math.pow(2, pos);
            pos++;
            bin = bin / 10;
        }
        while (dec > 0) {
            int rem = dec % 8;
            oct = rem * place + oct;
            place = place * 10;
            dec = dec / 8;
        }
        System.out.println("Octal: " + oct);
    }
}
