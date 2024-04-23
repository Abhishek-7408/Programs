#include <stdio.h>
int main(){
    int x,pro=1;
    scanf("%d",&x);
    for(int i=1;i<=x;i++){
        pro=pro*i;
    }
    printf("%d",pro);

}