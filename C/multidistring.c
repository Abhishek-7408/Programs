#include <stdio.h>
int main(){
    char s[3][10];
    printf("Enter three strings\n");

    for(int i=0;i<=2;i++)
    gets(&s[i][0]); //gets(s[i]);

    printf("strings you entered is:\n");
    for(int i=0;i<=2;i++)
    printf("%s\n",s[i]);


}
