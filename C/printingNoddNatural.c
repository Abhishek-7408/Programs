#include <stdio.h>
int main(){
    int n,i=1,x=1;
    printf("Print the terms");
    scanf("%d",&n);
    while(i<=n){
        printf("%d \n",x);
        x=x+2;
        i++;
    }
}