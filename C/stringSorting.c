#include <stdio.h>
#include <string.h>

int main(){

    char c[100];
    scanf("%s",c);
    char temp;
    int i,j;
    int n = strlen(c);
    for(i=0;i<n-1;i++){

for(j=i+1;j<n;j++){
    if(c[i]>c[j]){
temp = c[i];
c[i]=c[j];
c[j] = temp;

    }
}
    }

    printf("%s",c);
    return 0;
}