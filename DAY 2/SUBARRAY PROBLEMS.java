class Main {
    public static void main(String[] args) {

        int[] arr = {1,2,3};

        for(int start = 0; start < arr.length; start++) {

            for(int end = start; end < arr.length; end++) {

                for(int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                }

                System.out.println();
            }
        }
    }
}

Array:
1 2 3

Subarrays:
1
2
3
1 2
2 3
1 2 3

Formula:

Number of subarrays =
n × (n + 1) / 2

Example:

n = 5

5 × 6 / 2 = 15
