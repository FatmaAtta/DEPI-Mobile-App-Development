public class Fibonacci {
    static void printFibonacci(int n) {
        int first = 0, second = 1;
        for (int i = 0; i < n; ++i) {
            System.out.print(first + ", ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        int N = 10; // Change this to the desired number of terms
        printFibonacci(N);
    }
}
