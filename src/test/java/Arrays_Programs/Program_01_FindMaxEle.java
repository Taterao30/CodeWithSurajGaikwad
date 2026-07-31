package Arrays_Programs;

public class Program_01_FindMaxEle {
	
	public static void main(String[] args) {
		
		int arr[]= {1,3,4,2,5};
		
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("Max number of an array is: "+max);
	}

}
