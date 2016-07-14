
public class Inheritance_Lab_Block{
	public static void main(String[] args) {
		B b=new B();
		System.out.println(b.i);
	}
}

class B extends A{
	static{
		i=--i - i--;
		System.out.println("S.B- B Class"+i);
	}
	{
		i=++i + i++ ;
		System.out.println("I.B- B Class"+i);
	}
}

 class A{
	static int i=1111;
	static{
		i=i-- - --i;
		System.out.println("S.B-A Class"+i);//2
	}
	{
		i=i++ + ++i;
		System.out.println("I.B-A Class"+i);
	}
}