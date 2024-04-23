#include <stdio.h>
int main(){
    int a[5],*p;
    p = &a[0];
    for(int i=0;i<=4;i++)
    scanf("%d",p+i);

    for(int i=0;i<=4;i++)
    printf("%d",*(p+i));
}