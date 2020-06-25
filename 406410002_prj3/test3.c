#include <stdio.h>

int main()
{
    // use this file to test error message

    int a = 1;
    float b = 1.1;
    int c;
    // redeclared a
    long a;

    // type error for int + float
    // and the return attr_type is -2 ($c.attr_type = 1)
    c = a + b;

    // undeclared x (error message -> Do not exist.)
    x = 0;

    return 0;
}
