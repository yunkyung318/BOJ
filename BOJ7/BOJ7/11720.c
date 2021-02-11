#include <stdio.h>

int main()
{
	int n, sum = 0;
	char array[101] = { 0, };

	scanf("%d", &n);
	scanf("%s", array);

	for (int i = 0; i < n; i++)
		sum += array[i] - '0';

	printf("%d", sum);
	return 0;
}