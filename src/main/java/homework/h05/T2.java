package homework.h05;
import java.util.Arrays;
public class T2 { public static int[] sortedSquares(int[] nums) { int[] result = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
        result[i] = nums[i] * nums[i];
    }

    Arrays.sort(result);

    return result;
}

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                sortedSquares(new int[]{-4, -1, 0, 3, 10})
        ));
    }
}