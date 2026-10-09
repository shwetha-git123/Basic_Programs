public class LargestSmallestElement {
    public void largestSmallest(int arr[]) {
        int n = arr.length;
        int largest = arr[0];
        int smallest = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        System.out.println("Largest Element is: " + largest);
        System.out.println("Smallest Element is: " + smallest);
    }

    public static void main(String[] args) {
        LargestSmallestElement LSE = new LargestSmallestElement();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        LSE.largestSmallest(arr);
    }
}