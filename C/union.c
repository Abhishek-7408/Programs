
#include <stdio.h>
 union item
{
    int x;
    float y;
    char z;

};
void main()
{

    union item i1;
    i1.x=5;
    printf("%d",i1.x);


}