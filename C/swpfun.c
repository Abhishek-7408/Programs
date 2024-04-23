#include <stdio.h>
void swap(int *,int *);
int main()
{
    int a,b;
    printf("Enter Two Number\n");
    scanf("%d %d",&a,&b);
    swap(&a,&b);
    printf("%d %d",a,b);

}
void swap(int *x,int *y){
    int t = *x;
    *x = *y;
    *y=t;
}
