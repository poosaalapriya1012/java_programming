import java.util.*;
class avg_of_all_elements_in_the_array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
      
        System.out.println("enter size of the array: ");
        n=sc.nextInt();
        int arr[]=new int[n];
         System.out.println("Enter elements :");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        double sum=0;
         for (int i=0;i<n;i++){
            sum+=(double)arr[i];
        }
        double avg=sum/n;
        
        System.out.println("The average is " +avg);
        
        
        
        
    }
}