
class Number{
	public int find(int num) {
		int findNum=num;
		while(num>0) {
			findNum+=num%10;
			num/=10;
		}
		return findNum;
	}
	
}

public class Self_Number_4673 {

	public static void main(String[] args) {
		Number num=new Number();
		boolean selfNum[]=new boolean[10001];
		int findNum;
		
		for(int i=1;i<=10000;i++) {
			findNum=num.find(i);
			if(findNum<=10000)
				selfNum[findNum]=true;
		}
		
		for(int i=1;i<selfNum.length;i++)
			if(!selfNum[i])
				System.out.println(i+" ");
	}

}
