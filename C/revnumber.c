#include <stdio.h>
int main(){
    int x,r,y=0;
    scanf("%d",&x);
    while(x!=0){
        r=x%10;
        y=y*10+r;
        x=x/10;

    }

    printf("%d",y);
}