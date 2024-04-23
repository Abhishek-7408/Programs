#include <stdio.h>
int main(){
    int n;
    scanf("%d",&n);
    int pro=1;
    for(int i=2;i<=n;i++){
        if(i%2==0){
        pro*=i;

        }


    }

printf("%d",pro);


}