#include <stdio.h>

void main()
{
	int a = 100;
	int i;
	short s;
	long l;

	// comment test1111
	for (i=0; i < 5;i++)
		a ++;

	switch(a)
	{
		case 100 :
			printf("a = 100\n");
			break;
		case 101 :
			printf("a = 101\n");
			break;
		case 105 :
			printf("a = 105\n");
			break;
		default :
			printf("nonono\n");
			break;
	}
}
