class Adding_Element_in_an_Array{
    public static int[] insertAtEnd(int[] arr, int n, int value) {
     
        int newArr[] = new int[n + 1];
        
       
        for (int i = 0; i < n; i++) {
            newArr[i] = arr[i];
        }
        
        
        newArr[n] = value;
        return newArr;
    }

    public static void main(String args[]) {
       
        int n = 8;
        int arr[] = {10, 9, 14, 8, 20, 48, 16, 9};
        int value = 40;

        
        System.out.println("Original array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        arr = insertAtEnd(arr, n, value);

     
        System.out.println("After inserting the value at the end:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
