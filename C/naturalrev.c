#include <stdio.h>
int main(){
    int n,i;
    printf("Print the terms");
    scanf("%d",&n);
    for(i=1;i<=n;i++){
        printf("%d \n",n+1-i);
    }
}