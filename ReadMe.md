# Recursion

A process in which a function calls itself

e.g.

```c
void fun() {
    fun()
}
```

**Basic rules of 'Recursion'**

- Function should call itself
- There should be a base case
- Recursive call should align towards the base case

e.g.

```c
void fun(int n) {
    if (n == 1) {
        return 1;
    } else {
        printf(n);
        fun(n - 1);
    }
}
```

## Factorial of a number

Factorial of a number is the product of all the positive intergers till that number

e.g

5! = 1 x 2 x 3 x 4 x 5 = 120

```java
public class Main {
    public static void main(String[] args) {
        int n = 5;
        int m = 10;

        System.out.println(fact(n));
        System.out.println(fact(m));
    }

    static int fact(int num) {
        if (num < 0) return -1;

        if (num == 0 || num == 1)
            return 1;

        return num * fact(num - 1);
    }
}
```
