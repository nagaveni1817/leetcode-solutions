class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int[] result=new int[n];
        if(k==0){
            return result;
        }
        if (k > 0) {
            for (int i = 0; i < n; i++) {
                int sum = 0;

               
                for (int j= 1; j<=k;j++) {
                    int index = (i + j) % n;
                    sum += code[index];
                }

                result[i] = sum;
            }
        }

        else {
            k = -k;

            for (int i = 0; i < n; i++) {
                int sum = 0;

                for (int j = 1;j <= k; j++) {
                    int index = (i -j + n) % n; 
                    sum += code[index];
                }

                result[i] = sum;
            }
        }
        return result;
    }
}