package coding.bat.recursion.one;

public class RecursionOne {

    public static int factorial(int n) {

        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        return 2 + bunnyEars(bunnies - 1);
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int bunnyEars2(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else {
            if (bunnies % 2 == 0) {
                return 3 + bunnyEars2(bunnies - 1);
            } else {
                return 2 + bunnyEars2(bunnies - 1);
            }
        }
    }

    public static int triangle(int rows) {
        if (rows == 0) {
            return 0;
        }
        return rows + triangle(rows - 1);
    }

    public static int sumDigits(int n) {
        if (n < 10) {
            return n;
        }

        if (n % 10 == 0) {
            return sumDigits(n / 10);
        } else {
            return n % 10 + sumDigits(n / 10);
        }
    }
}
