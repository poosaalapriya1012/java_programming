
class MaximumSubarray_leetcode53{
    public static void main(String[] args) {
        // find the subarray with the largest sum  using Kadane's Algorithm
        int nums[]={5,4,-1,7,8};
       int maxsum=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            
            sum=sum+nums[i];
            maxsum=Math.max(sum,maxsum);
            if(sum<0){
                sum=0;
            }
        }//5 + 4 + (-1) + 7 + 8 = 23
        System.out.println("Maximum sum :"+maxsum);
    }
}