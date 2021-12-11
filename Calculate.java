//overloding
class Calculate
{
	void sum(int a, int b)
	{
	System.out.println("Sum is-"+(a+b));
	}
	void sum(float a, float b)
	{
		System.out.println("Sum is-"+(a+b));
	}
	public static void main(String args[])
	{
		Calculate cal=new Calculate();
		cal.sum(10,20);
		cal.sum(15.5f,26.7f);
	}
}