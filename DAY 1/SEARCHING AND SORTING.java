mport java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] tar = new int[n];
        for(int i =0;i<n;i++){
            tar[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        int left = 0;
        int right = n-1;
        while(left <= right){
            int mid = (left+right)/2;
        if(tar[mid] == target){
            System.out.println(mid);
        }else if(tar[mid] < target){
            left = mid+1;
        }else{
            right = mid -1;
        }
        }
        System.out.print(left);
    }}
