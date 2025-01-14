public class findpoweroptimal{
    public static int power(int x,int n){
        //Base Case (n == 0): If n is 0, the method returns 1. This is because any number raised to the power of 0 is 1.
         //time coomplexity: O(n)
        if(n==0){
            return 1;

        }
   
       int half=power(x,n/2);
       int halfsq=half*half;
        if(n%2==0){
          return halfsq;
        }
        else{
        return halfsq*x;
       }
    
    }
    public static void main(String args[]){
        System.out.println(power(2,5));
    }
}
