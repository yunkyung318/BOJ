import java.util.*;

public class OX_Quiz_8958 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String array[]=new String[sc.nextInt()];
		
		for(int i=0;i<array.length;i++)
			array[i]=sc.next();
		
		for(int i=0;i<array.length;i++) {
			int sum=0;
			int count=0;
			for(int j=0;j<array[i].length();j++) {
				if(array[i].charAt(j)=='O') {
					count++;
				}
				else {
					count=0;
				}
				sum+=count;
			}
			System.out.println(sum+" ");
		}
		
	}

}
