#include <stdio.h>

int main()
{
	int yyyy, mm, dd;
	scanf("%d.%d.%d", &yyyy, &mm, &dd);
	printf("%02d-%02d-%4d", dd, mm, yyyy);
}
