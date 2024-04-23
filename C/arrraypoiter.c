#include <stdio.h>
int main(){

int x[5],*p;
 p = &x[0];
for(int i=0;i<=4;i++){
    scanf("%d",p+i);
}
for(int i=0;i<=4;i++){
    printf("%d",*(p+i));
}




}
