#include <stdio.h>

typedef struct abc
{
	int ll;
}ab;

int main(void)
{
	float i = 0.0;
	double j = 0.0;
	long a = 1;
	short b = 1;
	const int c = 100;
	static int d = 50;
	volatile int e = 3;
	int aa = 5;

	switch(a)
	{
		case 0:
			i = i+1;
			break;
		case 1:
			j = j+1;
			break;
		default:
			break;
	}

	LOOP:do
	{
		a = a+1;
	}while(a<3);
	if (a<3)
		goto LOOP;
	b = sizeof(a);
	aa = 0;
	if(!aa)
		printf("%d\n", aa^aa);
}
