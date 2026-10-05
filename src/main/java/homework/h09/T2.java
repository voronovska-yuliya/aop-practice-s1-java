package homework.h09;
public class T2 {
    public static int findComplement(int num) {
        int mask = 1;

        while (mask <= num) {
            mask = mask << 1;
        }

        mask = mask - 1;

        return num ^ mask;
    }

    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }
}