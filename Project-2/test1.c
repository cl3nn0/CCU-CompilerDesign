void main()
{
	long a = 1;
	short b = 1;
	int aa;
	int bb[50];
	
	switch(a)
	{
		case 0:
			b=b+1;
			break;
		case 1:
			b = b+1;
			break;
		default:
			break;
	}

	while(a<3){
		b=b-1; 
		a = a+1;
	}
	
	for(a=0;a<2;a++)
		strcpy(bb,"123");

	// b = sizeof(a);
	aa = 0;
	if(aa)
		printf("%d\n", aa^aa);
	
}
