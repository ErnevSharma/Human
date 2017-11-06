public class Human {
	private String fullName;
	private int ethnicity;
	private int age;
	
	public Human(String fn, int e, int a)
	{
		fullName = fn;
		ethnicity = e;
		age = a;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int a)
	{
		age = a;
	}
	public String getName()
	{
		return fullName;
	}
	
	
	public int getRace()
	{
		return ethnicity;
	}
	
	
	public String toString()
	{
		return fullName + ", " + ethnicity + ", " + age;
	}
	
}