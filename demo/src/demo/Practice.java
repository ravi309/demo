package demo;

class A
{
	void show(int a)
	{
		System.out.println("In Class A");
	}

	void show(int a,int b)
	{
		System.out.println("In Class B");
	}
}
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();
		
		
		obj.show(9,7);

	}

}
