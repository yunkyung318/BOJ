#include <stdio.h>

int main()
{
	int n;
	int result = 0;

	scanf("%d", &n);

	for (int i = 1; i <= n; i++) {
		result += i;
	}

	printf("%d", result);
	return 0;
}