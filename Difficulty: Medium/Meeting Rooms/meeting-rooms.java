//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[][] arr = new int[n][2];
            for (int i = 0; i < n; i++) {
                String temp[] = br.readLine().trim().split(" ");
                arr[i][0] = Integer.parseInt(temp[0]);
                String x = temp[1];
                arr[i][1] = Integer.parseInt(x);
            }
            Solution obj = new Solution();
            boolean ans = obj.canAttend(arr);
            if (ans)
                System.out.println("true");
            else
                System.out.println("false");
        }
    }
}
// } Driver Code Ends

class Solution {
    static boolean canAttend(int[][] arr) 
    {
        int m=arr.length,n=arr[0].length;
        int temp[][] = new int[1][1];
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<m;j++)
            {
                if(arr[i][1] > arr[j][0])
                {
                    temp[0] = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp[0];
                }
            }
        }
        for(int i=0;i<m-1;i++)
        {
            if(arr[i][1] > arr[i+1][0])
                return false;
        
        }
        return true;
    }
}