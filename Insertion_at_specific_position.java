class Insertion_at_specific_position{
    static void insertAtPosition(int[] arr, int n, int value, int pos) {
        for (int i = n; i > pos; i--) {
            arr[i] = arr[i - 1];
        }
        arr[pos] = value;
    }

    public static void main(String args[]) {
        int n = 5;
        int pos = 2;
        int arr[] = new int[n + 1];
        arr[0] = 10;
        arr[1] = 9;
        arr[2] = 14;
        arr[3] = 8;
        arr[4] = 20;

        int value = 40;

        insertAtPosition(arr, n, value, pos);

        System.out.println("After inserting the value at position " + pos + ":");
        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
