package ExceptionPractice;

public class Demo3 {
	
	public static void main(String[] args) {
		
		int[] arr= {10,20,100,40,50};
		
		int max=arr[0];
		
		for(int ele: arr)
		{
			if(ele>max)//20>10-false,100>20=True,100>40=false;
			{
			max=ele;
		//  10=20;
			//20;,100
				
			}
			
		}
		System.out.println(max);
		
	}

}
