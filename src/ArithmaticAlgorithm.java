public class ArithmaticAlgorithm {

    public static int getGCD(int[] numbers) {

        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {

            result = gcd(result, numbers[i]);
        }

        return result;
    }

    private static int gcd(int a, int b) {

        while (b > 0) {
            int temp = b;
            b = a % b;
            a = temp;

        }

        return a;
    }

    public static int getLCM(int[] numbers) {

        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result = lcm(result, numbers[i]);
        }
        return result;
    }

    private static int lcm(int a, int b) {
        return a * (b / gcd(a, b));
    }

}
