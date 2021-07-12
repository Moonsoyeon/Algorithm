#include <stdio.h>

int main()
{
	int yymmdd;
	int code;
	scanf("%d-%d", &yymmdd, &code);
	printf("%06d%06d", yymmdd, code);
}

