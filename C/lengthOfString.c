#include <stdio.h>
#include <string.h>
int main(){
    //without using predefined;
    char s[20];
    int i;
    printf("Enter String\n");
    gets(s); //s==s[0]
    i=strlen(s);
    //for(i=0;s[i]!='\0';i++);
    printf("Length is %d",i);

    // using length function
    
}