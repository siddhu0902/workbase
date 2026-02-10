import java.util.Scanner;

public class q46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, temp, digits = 0;
        int sum = 0;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        temp = num;
        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }
        temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum = sum + (int) Math.pow(digit, digits);
            temp = temp / 10;
        }
        if (sum == num) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}
