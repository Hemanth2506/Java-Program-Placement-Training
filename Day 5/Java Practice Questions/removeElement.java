class Solution {
    public int removeElement(int[] arr, int target) {
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=target){
                arr[j]=arr[i];
                j++;
            }
        }
        return j;
    }
}