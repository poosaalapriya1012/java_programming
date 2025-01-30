class maxlengthofasubarraywhosesumdoesnotexceedk{
    public static void main(String[] args) {
        int[] arr={1,5,3,2,9};
        int l=0;
        int n=arr.length;
        int k=10;
        int temp=0;
        int max=0;
        //Time Complexity: O(n) (each element is visited at most twice)
    //Space Complexity: O(1) (constant extra space)
        for(int r=0;r<n;r++){
            temp=temp+arr[r];
            
            while(temp>k){
                temp=temp-arr[l];
                l++;
            }
            
            max=Math.max(max,r-l+1);
            
        }
        System.out.println(max);
        
    }
}
