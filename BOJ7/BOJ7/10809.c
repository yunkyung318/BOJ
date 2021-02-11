#include <stdio.h>
#include <string.h>

int main()
{
	int array[26];
	char s[100];

	scanf("%s", s);

	for (int i = 0; i < 26; i++)
		array[i] = -1;

	for (int i = 'a'; i <= 'z'; i++) {
		for(int j=0;j<strlen(s);j++)
			if (i == s[j]) {
				array[s[j] - 'a'] = j;
				break;
			}
	}

	for (int i = 0; i < 26; i++) {
		printf("%d", array[i]);
		if (i < 25)
			printf(" ");
	}
	return 0;
}