#include <stdio.h>
int main(){
    int k;
    k = sum(3);
    printf("%d",k);
}
// function
    int sum(int a){
        int s;
        if(a==1)
        return(a);
        s = a+ sum(a-1);
        return(s);

    
    }

