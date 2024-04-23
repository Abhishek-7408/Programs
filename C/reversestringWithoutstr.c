#include <stdio.h>
int main(){
    char s[20],swap;
    int i,l;
    printf("Enter String\n");
    gets(s);
    for(l=0;s[l];l++);
    for(i=0;i<l/2;i++){
        swap=s[i];
        s[i]=s[l-1-i];
        s[l-1-i]=swap;
    }
        printf("%s",s);



}
