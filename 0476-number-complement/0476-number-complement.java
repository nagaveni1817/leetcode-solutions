class Solution {
    public int findComplement(int num) {
        int n=num;
        int count=0;
        while(n>0){
            count++;
            n = n >> 1;
        }
        int mask=(1 << count)-1;
        return num^ mask;
    }
}