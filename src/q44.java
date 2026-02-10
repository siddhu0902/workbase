public class q44 {
    public static void main(String[] args) {
        int start = 1;
        int end = 200;
        for (int num = start; num <= end; num++) {
            int temp = num;
            int sum = 0;
            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + factorial(digit);
                temp = temp / 10;
            }
            if (sum == num) {
                System.out.print(num + " ");
            }
        }
    }
    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
