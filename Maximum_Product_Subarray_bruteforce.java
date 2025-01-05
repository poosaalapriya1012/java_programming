class Maximum_Product_Subarray{
    public static void main(String[] args) {
        int nums[]={2,-3,2,4};
        int n=nums.length;
        int prod;
        int maxprod=Integer.MIN_VALUE;
        //brute force approach
        for(int i=0;i<n;i++){
            prod=1;
            for(int j=i;j<n;j++){
                prod=prod*nums[j];
                if(prod>maxprod){
                    maxprod=prod;
                }
                
            }
        }
        System.out.println(maxprod);
    }
}
