package Factorial;

public class FactorialNumber {

    public int factorial(int n) {

        if (n<2) return 1;
        return n * factorial(n -1);
    }

    public static void main(String[] args) {
        FactorialNumber factorialNumber = new FactorialNumber();

        System.out.println(factorialNumber.factorial(3));
    }
}
