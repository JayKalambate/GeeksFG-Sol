class Solution {
    void pushZerosToEnd(int[] arr) {
        int n = arr.length;
        int nonZeroIndex = 0; // Position to place the next non-zero element

        // Move all non-zero elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                // Swap only if needed
                if (i != nonZeroIndex) {
                    int temp = arr[i];
                    arr[i] = arr[nonZeroIndex];
                    arr[nonZeroIndex] = temp;
                }
                nonZeroIndex++;
            }
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {0,1,25,34,0,0,0,0,1};
        sol.pushZerosToEnd(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
