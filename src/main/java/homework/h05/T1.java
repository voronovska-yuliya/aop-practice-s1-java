package homework.h05;
import java.util.Arrays;
public class T1 { public static int maxProductDifference(int[] nums) { Arrays.sort(nums);
    int n = nums.length;

    return nums[n - 1] * nums[n - 2]
            - nums[0] * nums[1];
}

    public static void main(String[] args) {
        System.out.println(maxProductDifference(
                new int[]{5, 6, 2, 7, 4}
        ));
    }
}