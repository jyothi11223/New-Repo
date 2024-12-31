package pack;

public class MethodOverload 
{

	public static void main(String[] args) 
	{
		MethodOverload obj=new MethodOverload();
		obj.method1(6);
		MethodOverload obj1=new MethodOverload();
		obj.method1(6,4.5f);
	}
	public void method1(int a)
	{
		System.out.println(a);
	}
	public void method1(int a, float b)
	{
		System.out.println(a);
		System.out.println(b);
	}

}
