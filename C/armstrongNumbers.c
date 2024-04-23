#include <stdint.h>
int main(){
    int s,r,n,x;
    

    printf("Armstrong Numbers are:\n");
    for(int n=1;n<=1000;n++){

        s=0;
        x=n;
        while(x!=0){
            r=x%10;
            s=s+x*x*x;
            x=x/10;


        }
        if(x==n)
        printf("%d\n",n);

        


    }


    

}