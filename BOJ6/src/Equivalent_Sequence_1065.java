import java.util.*;

public class Equivalent_Sequence_1065 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		sc.close();
		
		if(num<100) {
			System.out.println(num);
		}else {
			int result=99;
			
			for(int i=100;i<=num;i++)
				result+=Check(i);
			
			if(num==1000)
				result--;
			
			System.out.println(result);
		}
	}
    
    private static int Check(int num) {
		int num1=(num/100)%10;
		int num2=(num/10)%10;
		int num3=num%10;
		
		if(num1-num2==num2-num3)
			return 1;
		
		return 0;
	}
}
