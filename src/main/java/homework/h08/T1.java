package homework.h08;
public class T1 { public int findMaxConsecutiveOnes(int[] nums) { int count = 0; int max = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 1) {
            count++;
            if (count > max) {
                max = count;
            }
        } else {
            count = 0;
        }
    }

    return max;
}

    public static void main(String[] args) {
        T1 solution = new T1();

        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(solution.findMaxConsecutiveOnes(nums));
    }
}