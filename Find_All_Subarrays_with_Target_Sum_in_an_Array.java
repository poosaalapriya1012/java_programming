class Find_All_Subarrays_with_TargetSum_in_an_Array{
    public static void main(String[] args) {
        //Brute Force Approach
        //Iterates over all possible subarrays of the array a[].
        //Computes the cumulative sum of each subarray.
        //Checks if the cumulative sum matches the target value 7.
         //Prints the elements of the subarray if the condition is satisfied.
        int a[]={3,4,-7,1,3,3,1,-4};
        int target=7;
        int sum;
        for(int i=0;i<a.length;i++){
            sum=0;
            for (int j=i;j<a.length;j++){
                sum=sum+a[j];
                if(sum == target){
                    for (int k=i;k<=j;k++)
                    {
                     System.out.print(a[k] + " " );
                    }
                     System.out.println();
                }
            }
        }
    }
}