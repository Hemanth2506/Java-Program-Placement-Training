class Solution {
    public String countAndSay(int n) {
        String s="1";

        for(int i=2;i<=n;i++){
            StringBuilder ans=new StringBuilder();

            int count=1;
            char ch=s.charAt(0);

            for(int j=1;j<s.length();j++){
                if(s.charAt(j)==ch){
                    count++;
                }
                else{
                    ans.append(count);
                    ans.append(ch);

                    ch=s.charAt(j);
                    count=1;
                }
            }

            ans.append(count);
            ans.append(ch);

            s=ans.toString();
        }

        return s;
    }
}