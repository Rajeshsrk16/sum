
public class Sumofpowerss {


	public static class SumPower {

		
		public static void main(String[] args) {
			int num=122334;
			
			int b=Integer.toString(num).length();
			
			int a=0,sum=0;
			
			//System.out.println(b);
			while(b>0){
				a=num%10;
			System.out.print(a+": ");
				sum+=Math.pow(a, b);
			System.out.println(sum);
				num=num/10;
				b--;
			}
			
		
		 System.out.println(sum);
			
		}

	}
}



