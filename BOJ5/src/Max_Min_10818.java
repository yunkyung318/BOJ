import java.util.*;

public class Max_Min_10818 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int array[]=new int[num];
		int max=-1000000,min=1000000;
		
		for(int i=0;i<num;i++)
			array[i]=sc.nextInt();
		
		for(int i=0;i<num;i++) {
			if(array[i]>max)
				max=array[i];
			if(array[i]<min)
				min=array[i];
		}
		
		System.out.println(min+" "+max);
	}

}
