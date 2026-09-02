class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> stack=new Stack<>();
        HashMap<Integer, Integer> map=new HashMap<>();
        for(int i=nums2.length-1; i>=0; i--){
            int current=nums2[i];
            while(!stack.isEmpty() && stack.peek() <= current){
                stack.pop();
            }

            if(stack.isEmpty()){
                map.put(current,-1);
            }else{
                map.put(current,stack.peek());
            }
            stack.push(current);
        }

        int[] res=new int[nums1.length];
        for(int i=0; i<nums1.length; i++){
            res[i]=map.get(nums1[i]);
        }
        return res;
    }
}