public class Main {
    public static void main(String[] args) {
        int n = 5;
        int m = 10;

        System.out.println(fact(n));
        System.out.println(fact(m));
    }

    static int fact(int num) {
        if (num < 0)
            return -1;

        if (num == 0 || num == 1)
            return 1;
        return num * fact(num - 1);
    }
}