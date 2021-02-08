import java.util.*;

public class High_Average_1546 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		double score[]=new double[N];
		double max=0,average=0;
		
		for(int i=0;i<N;i++)
			score[i]=sc.nextDouble();
		
		for(int i=0;i<N;i++)
			if(max<score[i])
				max=score[i];
		
		for(int i=0;i<N;i++)
			score[i]=score[i]/max*100;
		
		for(int i=0;i<N;i++)
			average+=score[i];
		
		System.out.println(average/N+" ");
	}

}
