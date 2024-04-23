#include <stdio.h>
void input(int *p)
{
    int i;
    for(i=0;i<=4;i++)
    scanf("%d",p+i);
}
void display(int *p)
{
    int i;
    for(i=0;i<=4;i++)
    printf("%d",*(p+i));
}

int main(){
    int a[5];
    input(a);
    display(a);

}