#include <stdio.h>
#define MAX 100

int main()
{
	int A[MAX], B[MAX];
	int num = 0;

	while (1) {
		scanf("%d %d", &A[num], &B[num]);
		if (A[num] == 0 || B[num] == 0)
			break;
		num++;
	}
	
	for (int i = 0; i < num; i++) {
		printf("%d\n", A[i] + B[i]);
	}

	return 0;
}