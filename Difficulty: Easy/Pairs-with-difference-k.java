class Solution {
    int countPairsWithDiffK(int[] arr, int k) {
        int count=0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int num: arr){
            if(mp.containsKey(num-k))count+=mp.get(num-k);
            if(mp.containsKey(num+k))count+=mp.get(num+k);
            mp.put(num,mp.getOrDefault(num,0)+1);
        }
        return count;
    }
}
