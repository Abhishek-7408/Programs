#include <stdio.h>

int main() {
    int x, y, L;

    printf("Enter Two Numbers:\n");
    scanf("%d %d", &x, &y);

    for (L = 1; L <= x * y; L++) {
        if (L % x == 0 && L % y == 0) {
            // L is the least common multiple
            break;
        }
    }

    printf("LCM is %d\n", L);

    return 0;
}
