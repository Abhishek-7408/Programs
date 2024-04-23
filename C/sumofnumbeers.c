#include <stdio.h>
int main(){
    int x;
    scanf("%d",&x);
    int sum=0;
    for(int i=0;i<=x;i++){
        sum=sum+i;
    }
    printf("%d",sum);

}