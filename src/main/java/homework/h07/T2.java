package homework.h07;
public class T2 {
    public static boolean isSameAfterReversals(int num) {
        if (num == 0) {
            return true;
        }

        return num % 10 != 0;
    }

    public static void main(String[] args) {
        System.out.println(isSameAfterReversals(526));
    }
}