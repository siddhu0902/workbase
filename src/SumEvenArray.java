public class SumEvenArray {
    static int sumEvenNumbers(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 9, 6};
        System.out.println(sumEvenNumbers(arr));
    }
}
