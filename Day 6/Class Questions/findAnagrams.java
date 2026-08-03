class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> list=new ArrayList<>();
        char[] ch1=p.toCharArray();
        Arrays.sort(ch1);
        for(int i=0;i<=s.length()-p.length();i++){
            String str=s.substring(i,i+p.length());
            char[] ch2=str.toCharArray();
            Arrays.sort(ch2);
            if(Arrays.equals(ch1,ch2)){
                list.add(i);
            }
        }
        return list;
    }
}