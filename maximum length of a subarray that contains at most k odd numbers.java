public class Main {
    public static void main(String[] args) {
        //maximum length of a subarray that contains at most k odd numbers
        int arr[]={12,1,3,1,1,6,7,1,8,10};
        int l=0;
        int ans=0;//count
        int k=2;
        int maxlen=0;
        for(int r=0;r<arr.length;r++){
            if(arr[r]%2==1){
                ans++;
            }
            while(ans>k){
                if(arr[l]%2==1){
                    ans--;
                }
                l++;
            }
            maxlen=Math.max(maxlen,r-l+1);
        }
        System.out.println(maxlen);
    }
}