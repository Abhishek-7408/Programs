#include <stdio.h>
long int DecimalTo_Binnary(int n){
long int binary=0;
int remainder,i;
for(i=1;n!=0;i=i*10)
{
remainder = n%2;

n=n/2;
binary=binary+remainder*i;

}


    return binary;
}


int main(){

int n;
scanf("%d",&n);
printf("%d",DecimalTo_Binnary(n));
return 0;

}