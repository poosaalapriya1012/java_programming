
class highest_sum_of_subarraylength3{
    public static void main(String[] args) {
        int a[]={5,9,1,8,7};
        int countlen=0;
        int maxsum=Integer.MIN_VALUE;
        int sum;
        //brute force approach
        for(int i=0;i<a.length;i++)
        {   countlen=0;
            sum=0;
            for(int j=i;j<a.length;j++){
                sum=sum+a[j];
                countlen=countlen+1;
                if(sum>maxsum){
                    maxsum=sum;
                }
                if(countlen==3){
                    break;
                }
            }
        }
        System.out.println(maxsum);
        
    }
}