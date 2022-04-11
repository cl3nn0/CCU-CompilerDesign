#include <stdio.h> 
#include <string.h>

void main()
{
	int a;
	int b;
	int aa;
	long cc[50];
	
	a = a+1;
	b = 1;
	aa = sizeof(a);

	switch(a)
	{
		case 0:
			aa = aa+1;
			break;
		case 1:
			b = b+1;
			break;
		default:
			break;
	}

	while(a<3){
		b = b-1; 
		a = a+1;
	}
	
	aa = strlen("1234");
	if(aa == 4 && b != 100)
		printf("%d\n", aa>aa || aa<aa);
	
}
