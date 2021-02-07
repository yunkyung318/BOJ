#include <stdio.h>

int main()
{
	int n;
	int front, back;
	int num = 0;
	int new_num;

	scanf("%d", &n);

	new_num = n;

	while (1) {
		front = new_num / 10;
		back = new_num % 10;
		new_num = back * 10 + ((front + back) % 10);

		num++;

		if (new_num == n)
			break;
	}

	printf("%d", num);
	return 0;
}