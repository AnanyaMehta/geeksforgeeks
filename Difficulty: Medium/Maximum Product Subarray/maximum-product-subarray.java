//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int n = inputLine.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxProduct(arr));
        }
    }
}

// } Driver Code Ends
class Solution {
    int maxProduct(int[] arr) {
        if (arr.length == 0) return 0;
        int maxSoFar = arr[0], minSoFar = arr[0], result = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < 0) {
                int temp = maxSoFar; maxSoFar = minSoFar; minSoFar = temp;
            }
            maxSoFar = Math.max(arr[i], maxSoFar * arr[i]);
            minSoFar = Math.min(arr[i], minSoFar * arr[i]);
            result = Math.max(result, maxSoFar);
        }
        return result;
    }
}