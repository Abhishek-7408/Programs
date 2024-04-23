#include <stdio.h>
void fibonaciiPrint(int n){
    int first=0,second=1,next;
    for(int i=0;i<n;i++){
        printf("%d",first);
        next=first+second;
        first=second;
        second=next;
    }

}

int main(){
    int n;
    scanf("%d",&n);
    if(n<=0){
        return 1;
    }
    else{
        fibonaciiPrint(n);
        return 0;
    }
}