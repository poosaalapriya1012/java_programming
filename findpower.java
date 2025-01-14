public class findpower{
    public static int power(int x,int n){
        //Base Case (n == 0): If n is 0, the method returns 1. This is because any number raised to the power of 0 is 1.
         //time coomplexity: O(n)
        if(n==0){
            return 1;

        }
        return x*power(x,n-1);
    }
    public static void main(String args[]){
        System.out.println(power(2,10));
    }
}
