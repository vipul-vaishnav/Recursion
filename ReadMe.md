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

## StackOverflow in Recursion

It results in program crash.

All function calls are stored in stack for their execution and once executed they are popped off the stack.

A stack can only store a finite number of
function calls, let us assume a stack can store "N" number of function calls but when the number of function calls exceeds "N" then thatcondition is known as _StackOverflow_

1. If there is no base case, then there will be infinite function calls which will result in stack overflow
2. When recursive call does not align towars the base case then it causes stack overflow

## Example of recursion

1.

```java
    // print numbers from n to 1

    static void fun(int n) {
        if (n == 0) return;
        System.out.println(n);
        fun(n - 1);
    }
```

2.

```java
    // print numbers from 1 to n
    
    static void fun2(int n) {
        if (n == 0)
            return;
        fun2(n - 1);
        System.out.println(n);
    }
```
