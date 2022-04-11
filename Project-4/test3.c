#include <stdio.h>

int main()
{
	int a = 10;
	int b = 5;

	while (a > 5 && b < a)
	{
		a -- ;
		b = 11 - a;
		printf("in while loop , a = %d , b = %d\n",a,b);
	}

	for (a = 9; b >= 1 || a <= 0 ; a++)
	{
		b = a - 87;
	}

	if (b < 3)
	{
		b = 333;
		printf("i am if-then statement !!!\n");
		printf("after for loop and if-then statement , a = %d , b = %d\n",a,b);
	}

	return 0;
}
