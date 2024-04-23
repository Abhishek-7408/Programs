#include <stdio.h>

int counts(int n,int m){
int count =0;
while(n>0){

if(n%10==m){
    count++;
}
n=n/10;
}
return count;
}

int range_count(int n,int m){
    int count =0,i;
    for(i=2;i<=n;i++){
    count+=counts(i,m);
}

    return count;
}


int main(){
    int n,m;
    scanf("%d %d",&n,&m);
    printf("%d",range_count(n,m));
}
