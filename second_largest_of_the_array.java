import java.util.*;
class second_largest_of_array{
    public static void main(String[] args) {
        int a[]={1,2,3,45,5};
        Arrays.sort(a);
        int n=a.length;
        int max=a[n-1];
        int second_max=0;
        for (int i=n-2; i >= 0;i--){
            if(a[i]!=max){
                second_max=a[i];
                break;
            }
        }
        System.out.println(second_max);
    }
}