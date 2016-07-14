public class Inheritance_var {
	public static void main(String[] args) {
		D d =new F();
		d.get();
		System.out.println(d.a);
	}
}

class D{
	 int a=10;
	 public void get(){
			System.out.println(a);
		}
}

class F extends D{
	 int a=20;
	public void get(){
		System.out.println(a);
	}
}
