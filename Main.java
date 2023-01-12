public class Main {
    public static void main(String[] args) {
        int n = 5;
        int m = 10;

        System.out.println(fact(n));
        System.out.println(fact(m));

        fun(n);
        fun2(n);
    }

    static int fact(int num) {
        if (num < 0)
            return -1;

        if (num == 0 || num == 1)
            return 1;
        return num * fact(num - 1);
    }

    static void fun(int n) {
        if (n == 0)
            return;
        System.out.println(n);
        fun(n - 1);
    }

    static void fun2(int n) {
        if (n == 0)
            return;
        fun2(n - 1);
        System.out.println(n);
    }
}