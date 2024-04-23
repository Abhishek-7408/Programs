#include <stdio.h>

int main() {
    int choice, a, b, s;
    printf("\n1 Add");
    printf("\n2 Print Natural numbers");
    printf("\n3 Even or odd");

    printf("\n \nSelect Your Choice: ");
    scanf("%d", &choice);

    switch (choice) {
        case 1:
            printf("Enter two numbers: ");
            scanf("%d%d", &a, &b);
            s = a + b;
            printf("\nSum is %d", s);
            break;
        case 2:
            printf("Enter a number: ");
            scanf("%d", &a);
            for (int i = 1; i <= a; i++)
                printf("%d ", i);
            printf("\n");
            break;
        case 3:
            printf("Enter a number: ");
            scanf("%d", &a);
            if (a % 2 == 0)
                printf("%d is an even number\n", a);
            else
                printf("%d is an odd number\n", a);
            break;
        default:
            printf("Invalid choice\n");
    }

    return 0;
}
