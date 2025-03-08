class count_pos_neg{
    public static void main(String[] args) {
        int a[]={-3,-2,1,1,2,3};
        int low=0;
        int high=a.length-1;
        int pos=0;
        int neg=0;
        int n=a.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]>0){
                pos=n-mid;
                high=mid-1;
            }
            if(a[mid]<0){
                neg=mid+1;
                low=mid+1;
            }
        }
        System.out.println(pos + " " +  neg);
    }
}