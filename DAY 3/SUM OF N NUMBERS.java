Find:

1 + 2 + 3 + 4 + 5 = 15
Code
  
class Main {

    static int sum(int n) {

        if (n == 0) {
            return 0;
        }

        return n + sum(n - 1);
    }

    public static void main(String[] args) {

        System.out.println(sum(5));
    }
}

Output
15
