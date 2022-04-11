#include <stdio.h>

void main()
{
   float a = 1.1;
   float b = 2.2;
   double e;
   int c = 3;
   int d;

   c ++;
   a = a + b;
   d = c + 777*(8+9);

   if (d > c)
	   a = 6.6;
   else
	   a = 0.6;

   printf("a = %f\n",a);
   printf("b = %f\n",b);
   printf("c = %d\n",c);
   printf("d = %d\n",d);
}
