import java.util.*;

public class Average_Freshman_4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		int student[] = new int[1000];
		int count[] = new int[C];
		int num[] = new int[C];
		double ratio[]=new double[C];
		int sum;
		double average;

		for (int i = 0; i < C; i++) {
			num[i] = sc.nextInt();
			sum = 0;

			for (int j = 0; j < num[i]; j++) {
				student[j] = sc.nextInt();
				sum += student[j];
			}

			average = (double) sum / num[i];

			for (int j = 0; j < num[i]; j++) {
				if (student[j] > average)
					count[i]++;
			}
		}

		for (int i = 0; i < C; i++) 
			ratio[i]=((double)count[i] / (double)num[i]) * 100.0;
		
		for(int i=0;i<C;i++) {
			System.out.printf("%.3f",ratio[i]);
			System.out.println("%");
		}
	}
}
