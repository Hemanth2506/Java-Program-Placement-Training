class Solution{
    public int findNumbers(int[] arr){
        int count=0;
        for(int n:arr){
            if(String.valueOf(n).length()%2==0){
                count++;
            }
        }
        return count;
    }
}