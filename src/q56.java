import java.util.Scanner;

public class q56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        String hex = "";
        System.out.print("Enter a decimal number: ");
        num = sc.nextInt();
        while (num > 0) {
            int rem = num % 16;
            if (rem < 10)
                hex = rem + hex;
            else
                hex = (char)('A' + rem - 10) + hex;
            num = num / 16;
        }
        System.out.println("Hexadecimal: " + hex);
    }
}
