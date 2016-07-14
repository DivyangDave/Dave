
public class Lab8 {
	public static void main(String[] args) {
	Cat c1=new Cat("A");
	Cat c2=new Cat("B");
	c1.Print();
	c2.Print();
	Cat T=c1;
	c1=c2;
	c2=T;
	c1.Print();
	c2.Print();
	}
}

 class Cat{
	String c;
	
	 public Cat(String str){
		 this.c=str;
	 }
	 public void Print(){
		 System.out.println(c);
	 }
}
