Question:

Array:
-2 1 -3 4 -1 2 1 -5 4

Maximum Sum = 6
Subarray = 4 -1 2 1

  int max = Integer.MIN_VALUE;

for(int i = 0; i < n; i++) {

    int sum = 0;

    for(int j = i; j < n; j++) {

        sum += arr[j];

        max = Math.max(max, sum);
    }
}
