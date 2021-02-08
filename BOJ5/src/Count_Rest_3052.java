import java.util.*;

public class Count_Rest_3052 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A[]=new int[10];
		int rest[]=new int[42];
		int count=0;
		
		for(int i=0;i<A.length;i++) {
			A[i]=sc.nextInt();
		}
		
		for(int i=0;i<rest.length;i++) {
			rest[i]=0;
		}
		
		for(int i=0;i<A.length;i++) {
			rest[A[i]%42]++;
		}
		
		for(int i=0;i<rest.length;i++) {
			if(rest[i]!=0)
				count++;
		}
		
		System.out.println(count+" ");
	}

}
