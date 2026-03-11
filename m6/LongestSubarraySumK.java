import java.util.HashMap;

public class LongestSubarraySumK {

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, -2, 5};
        int k = 5;

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum == k)
                maxLength = i + 1;

            if (map.containsKey(sum - k))
                maxLength = Math.max(maxLength, i - map.get(sum - k));

            if (!map.containsKey(sum))
                map.put(sum, i);
        }

        System.out.println("Longest Length = " + maxLength);
    }
}
