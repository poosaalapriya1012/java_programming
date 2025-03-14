
import java.util.*;
class Main{
    public static void main(String[] args) {
        int nums[]={1,2,5,9};
        int n=nums.length;
       
        int ans=0;
        int sum=0;
        int threshold=6;
        int maxi=nums[0];
        for(int i=1;i<n;i++){
            maxi=Math.max(maxi,nums[i]);
        }
        for(int d=1;d<maxi+1;d++){
            sum=0;
            for(int num:nums){
                sum+=(int)Math.ceil((double)num/d);
            }
            if(sum<=threshold){
                ans=d;
                break;
            }
        }
        System.out.println(ans);
        
    }
}