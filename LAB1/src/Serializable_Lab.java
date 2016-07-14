import java.io.*;
public class Serializable_Lab {
	public static void main(String[] args) throws Exception{
	try(FileOutputStream Fio= new FileOutputStream("F:\\FILE\\EXP\\info.txt");
		ObjectOutputStream Oos=new ObjectOutputStream(Fio);)
		{
		Student Str1=new Student(1,"Dave",78480361);
		Student.Count=9;
		System.out.println(Str1);
		Oos.writeObject(Str1);
		System.out.println("Object Serialized");
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
}

class Student implements Serializable{
	int Sid;
	String Sname;
	long Phone;
	static int Count =3;
	
	 Student(int Sid,String Sname,long Phone) {
		this.Sid=Sid;
		this.Sname=Sname;
		this.Phone=Phone;
	}
	
	public String toString(){
		return Sid+"\t"+Sname+"\t"+Phone+"\t"+Count;
	}
}
