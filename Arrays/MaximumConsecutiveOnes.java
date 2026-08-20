class MaximumConsecutiveOnes{
    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,0,0,1,1,1};
        int len = nums.length;
        int count = 0;
        int maxCount = 0;

        for(int i=0; i<len; i++){
            if(nums[i]==1){
                count++;
            }
            else{
                maxCount = Math.max(count, maxCount);
                count = 0;
            }
        }
        System.out.println(Math.max(count,maxCount));
    }
}