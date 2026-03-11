class Solution {
    public int minimumSum(int num) {
        char ch[]=String.valueOf(num).toCharArray();
        Arrays.sort(ch);
        int a=(ch[0]-'0')*10+(ch[2]-'0');
        int b=(ch[1]-'0')*10+(ch[3]-'0');
        return a+b;
    }
}