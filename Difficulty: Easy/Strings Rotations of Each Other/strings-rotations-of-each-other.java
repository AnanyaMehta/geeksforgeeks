//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {

    public static void main(String[] args) throws IOException {

        // taking input using BufferedReader class
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // taking total count of testcases
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            // Reading the two Strings
            String s1 = br.readLine();
            String s2 = br.readLine();

            // Creating an object of class Rotate
            Solution obj = new Solution();

            // calling areRotations method
            // of class Rotate and printing
            //"1" if it returns true
            // else "0"
            if (obj.areRotations(s1, s2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
// } Driver Code Ends

class Solution {
    public static boolean areRotations(String s1, String s2) {
        int n=s1.length();
        for(int i=0;i<n;i++){
            if(s1.charAt(0)==s2.charAt(i) && (i==0 || s1.charAt(n-1)==s2.charAt(i-1))){
                if(checkRotation(i,s1,s2,n)) return true;
            }
        }
        return false;
    }
    private static boolean checkRotation(int i, String s1, String s2, int n){
        for(int j=0;j<n;j++){
            if(s1.charAt(j)!=s2.charAt(i%n)) return false;
            i++;
        }
        return true;
    }
}