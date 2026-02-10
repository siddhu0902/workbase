import java.util.Scanner;

public class q52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int oct = 0;
        int place = 1;
        System.out.print("Enter a decimal number: ");
        num = sc.nextInt();
        while (num > 0) {
            int rem = num % 8;
            oct = rem * place + oct;
            place = place * 10;
            num =num/ 8;
        }
        System.out.println("Octal: " + oct);
    }
}
