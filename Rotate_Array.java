public class Rotate_Array {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int d = 2; // Number of positions to rotate

        // Rotate the array
        rotate(a, d);

        // Print the rotated array
        for (int num : a) {
            System.out.print(num + " ");
        }
    }
    static void reverse(int []a ,int s ,int e)
    {
        while(s<e){
            int temp=a[s];
            a[s]=a[e];
            a[e]=temp;
            s++;
            e--;
        }
    }
    static void rotate(int[] a, int d) {
        d = d % a.length;
        if(d < 0) {
            d += a.length; // Handle negative rotations
        }
        
        reverse(a, 0,  d - 1); // Reverse the first part
        reverse(a, d, a.length - 1); // Reverse the second part
        reverse(a, 0, a.length - 1); // Reverse the entire array
    }
}
