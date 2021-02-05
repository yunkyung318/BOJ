#include <stdio.h>
#include <stdlib.h>

int main()
{
	int T;
	int *A, *B;

	scanf("%d", &T);

	A = (int *)malloc(sizeof(int)*T);
	B = (int *)malloc(sizeof(int)*T);

	for (int i = 0; i < T; i++) {
		scanf("%d %d", &A[i], &B[i]);
	}

	for (int i = 0; i < T; i++) {
		printf("%d\n", A[i] + B[i]);
	}

	return 0;
}