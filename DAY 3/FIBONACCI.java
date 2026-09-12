Fibonacci sequence:

0 1 1 2 3 5 8 13 ...

Formula:

F(n) = F(n-1) + F(n-2)
Code
  
class Main {

    static int fibonacci(int n) {

        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        System.out.println(fibonacci(6));
    }
}

Output
8
