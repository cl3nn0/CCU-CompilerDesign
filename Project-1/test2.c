#include <stdio.h>

void useless()
{
	printf("HELLO WORLD\n");
	return;
}

int main(void)
{
	// comment 1 test! :)
	/* comment 2 test! ^^ */
	useless();
	while(1)
		break;
	for(int i = 0; i < 5; i++)
		if(i>5)
			continue;
		else
			continue;
	float i = 0;
	i++;
	i--;
	if((i+5-1*2/2)>1 || ((5%5<1) && (1*3>2)) || (1+1<=3) || (1+2>=3))
		return 0 ;
	int k = 256;
	k = k >> 1;
	k = k << 1;

	return 0;
}
