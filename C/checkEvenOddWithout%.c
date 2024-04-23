#include <stdio.h>
int main(){
    int x;
    printf("Enter Number");
    scanf("%d",&x);
    // if(x%2==0){
    //     printf("Even ");
        
    // }
    // else{
    //     printf("ODD");
    // }

    if(x&1){
        printf("Odd Number");
    }
    else{
        printf("Even");
    }
}