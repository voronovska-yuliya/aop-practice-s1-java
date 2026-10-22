package homework.h07;
public class T2 { public int numberOfSteps(int num) { int steps = 0;
    while (num > 0) {
        if (num % 2 == 0) {
            num = num / 2;
        } else {
            num--;
        }

        steps++;
    }

    return steps;
}

    public static void main(String[] args) {
        T2 solution = new T2();
        System.out.println(solution.numberOfSteps(14));
    }
}