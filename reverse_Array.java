public class reverse_Array {
    
    public void ArrayREverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] ar = {1, 2, 3, 4, 5};

        // Create an instance of the class
        reverse_Array obj = new reverse_Array();

        // Call the ArrayREverse method
        obj.ArrayREverse(ar);

        // Print the reversed array
        for (int num : ar) {
            System.out.print(num + " ");
        }
    }
}