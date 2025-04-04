class Second_Largest {
    public static int secondLargest(int[] arr) {
        if (arr.length < 2) return -1;

        int first = -1, second = -1;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        return second;
    }

    public static void main(String[] args) {
        System.out.println(secondLargest(new int[]{12, 35, 1, 10, 34, 1}));  // Output: 34
        System.out.println(secondLargest(new int[]{10, 5, 10}));            // Output: -1
        System.out.println(secondLargest(new int[]{5}));                     // Output: -1
    }
}
