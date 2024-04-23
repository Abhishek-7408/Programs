#include <stdio.h>
int fibonacii(int n){
    if(n==0){
        return 0;
    }
    else if(n==1){
        return 1;
    }
    else{
        return fibonacii(n-1)+fibonacii(n-2);
    }
}

int main(){
    int n;
    scanf("%d",&n);
    if(n<0){
        return 1;
    }

    int result = fibonacii(n);
    printf("%d",result);
    return 0;
}