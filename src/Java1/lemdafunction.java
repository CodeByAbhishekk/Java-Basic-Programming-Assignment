package Java1;

//interface A{
//	void show ();
//}
//public class lemdafunction 
//{
//
//	public static void main(String[]arr)
//	{
//		A r = () -> System.out.println("Hi");
//		r.show();
//	}
//}

class TestGen<T>
{
	void show(T a) {
		System.out.println("Value"+a);
	}
}
class lemdafunction
{
	public static void main(String[]args) {
		TestGen<Integer> i = new TestGen<Integer>();
		i.show(10);
		TestGen<Double> j = new TestGen<Double>();
		j.show(45.6);
		TestGen<String> k = new TestGen<String>();
		k.show("Asish");
	}
}
