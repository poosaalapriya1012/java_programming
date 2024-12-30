import java.util.*;
class median_of_the_array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter size of the array: ");
        n=sc.nextInt();

        int a[]=new int[n];
        System.out.println("Enter elements :");
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
        Arrays.sort(a);
       
        double median;
        if(n %2 ==0)
        {
        int idx1=n/2;
        int idx2=(n/2)-1;
        median=(a[idx1]+a[idx2] )/2;
        }
        else{
            int idx=n/2;
            median=a[idx];
        
        }
        System.out.println(median);
        
        
        
        
    }
}