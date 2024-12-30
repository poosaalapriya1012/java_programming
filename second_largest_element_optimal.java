//This Java program finds the second largest element in an integer array. 
class second_largest_element_optimal{
    public static void main(String[] args) {
        
        int a[]={1,2,7,3,4};
        int largest = a[0];
        
        for (int i = 1; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }
        int scnd_max= Integer.MIN_VALUE;
         for (int i = 0; i < a.length; i++) {
            if (a[i] > scnd_max && a[i] != largest) {
                scnd_max = a[i];
            }
        }
        
        System.out.println("The second largest element in the array is: " + scnd_max);
    }
}