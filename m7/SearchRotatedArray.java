public class SearchRotatedArray {

    static int search(int arr[], int target) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == target)
                return mid;

            // left half sorted
            if (arr[low] <= arr[mid]) {

                if (target >= arr[low] && target < arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            // right half sorted
            else {

                if (target > arr[mid] && target <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {6,7,8,1,2,3,4,5};
        int target = 3;

        int result = search(arr, target);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");
    }
}
