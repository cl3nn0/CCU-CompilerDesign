#include <stdio.h>
#include <string.h>

int main(void)
{
	char str1[1024] = {"string test 123... or headerFile.h?"};
	char str2[1024];
	printf("Input: ");
	scanf("%s", str2);

	int len1 = strlen(str1);
	int len2 = strlen(str2);

	printf("Str : %s , %s\n", str1, str2);
	printf("Len : %d , %d\n", len1, len2);

	if(strcmp(str1, str2) != 0)
		strcat(str2, str1);
	strcpy(str1, str2);

	if(strcmp(str1, str2) == 0)
		printf("Success!\n");

	return 0;
}
