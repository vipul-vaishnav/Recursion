#include <stdio.h>

int fact(int n) {
    if (n <= 0) return 1;
    return n * fact(n - 1);
}

int main() {
    int ans, num;

    printf("Enter the number\n");
    scanf("%d", &num);

    ans = fact(num);

    printf("Factorial of %d is %d\n", num, ans);
    return 0;
}