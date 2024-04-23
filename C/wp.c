#include <stdio.h>
int main(){

    int a,b;
    printf("Enter two Numbers");
    scanf("%d %d",&a,&b);
   int t = a;
   a=b;
   b=t;
   printf("a=%d b=%d",a,b);




} 