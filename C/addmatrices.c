#include <stdio.h>

int main() {
    int rows, columns;
    scanf("%d %d", &rows, &columns);
    int a[rows][columns], b[rows][columns], i, j, c[rows][columns];

    printf("Enter elements of first matrix:\n");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            scanf("%d", &a[i][j]);
        }
    }

    printf("Enter elements of second matrix:\n");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            scanf("%d", &b[i][j]);
        }
    }

    printf("Sum of matrices:\n");
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            c[i][j] = a[i][j] + b[i][j];
            printf("%d ", c[i][j]);
        }
        printf("\n");
    }

    return 0;
}