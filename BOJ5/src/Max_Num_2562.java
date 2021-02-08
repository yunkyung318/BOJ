import java.util.*;

public class Max_Num_2562 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int array[]=new int[9];
		int max=0,max_index=0;
		
		for(int i=0;i<array.length;i++)
			array[i]=sc.nextInt();
		
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
				max_index=i+1;
			}
		}
		
		System.out.print(max+"\n"+max_index);
	}

}
