#include <stdio.h>
int main(){
    // int a,b,t;
    // scanf("%d %d",&a,&b);
    // t=a;
    // a=b;
    // b=t;
    // printf("%d %d",a,b);

// swapping without third variable.
int a,b;
scanf("%d %d",&a,&b);
a=a+b;
b=a-b;
a=a-b;
printf("%d %d",a,b);







}