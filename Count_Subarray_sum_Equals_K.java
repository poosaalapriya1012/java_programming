class Count_Subarray_sum_Equals_K{
    public static void main(String[] args) {
       //brute force approach
        int a[]={7,3,3,1,-4};
        int target=7;
        int sum;
        int count=0;
        for(int i=0;i<a.length;i++){
            sum=0;
            for (int j=i;j<a.length;j++){
                sum=sum+a[j];
                if(sum == target){
                    count++;
                  
                }
            }
        }
           System.out.println(count);
    }
}