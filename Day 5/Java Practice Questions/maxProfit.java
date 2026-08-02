class Solution {
    public int maxProfit(int[] arr) {
        int max=arr[0];
        int profit=0;
        for(int i=1;i<arr.length;i++){
            if(max>arr[i]){
                max=arr[i];
            }
            profit=Math.max(profit,arr[i]-max);
        }
        return profit;
    }
}