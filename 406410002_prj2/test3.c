int main()
{
 char str1[1024];
 char str2[1024];
 int len1 = 10;
 int len2;

 printf("Input: ");
 scanf("%s", str2);
 len2 = strlen(str2);

 printf("Str : %s , %s\n", str1, str2);
 printf("Len : %d , %d\n", len1, len2);

 if(len2)
  strcpy(str2, str1);

 if(len2 && len1)
  printf("Success!\n");

 return 0;
}
