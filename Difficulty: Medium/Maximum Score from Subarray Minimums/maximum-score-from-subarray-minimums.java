//{ Driver Code Starts
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());

        while (t-- > 0) {
            String line = scanner.nextLine();
            String[] tokens = line.split(" ");
            List<Integer> nums = new ArrayList<>();
            for (String token : tokens) {
                nums.add(Integer.parseInt(token));
            }
            int[] arr = new int[nums.size()];
            int idx = 0;
            for (int i : nums) arr[idx++] = i;
            Solution solution = new Solution();
            System.out.println(solution.pairWithMaxSum(arr));

            System.out.println("~");
        }

        scanner.close();
    }
}

// } Driver Code Ends

class Solution {
    public int pairWithMaxSum(int[]arr) {
        int n = arr.length; int max=Integer.MIN_VALUE; int sum=0;
        int i=0, j=1;
        while(j<n && i<n-1){
            sum = arr[i]+ arr[j];
            max = Math.max(max, sum);
            sum =0;
            i++; j++;
        }
        return max;
    }
}