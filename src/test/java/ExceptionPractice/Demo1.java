package ExceptionPractice;

public class Demo1 {
	
	public String  getName() throws CustomizedException
	{
    
		String name=null;
		
		
		if(name==null)
		{
			throw new CustomizedException("Name should not be null");
		}
		else
		{
			name="Suraj Gaikwad";
		}
		return name;

	}
	
	public static void main(String[] args)throws CustomizedException {
		Demo1 obj=new Demo1();
		String name=obj.getName();
		System.out.println(name);
	}
}
