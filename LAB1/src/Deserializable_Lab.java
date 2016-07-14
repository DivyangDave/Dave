import java.io.*;
public class Deserializable_Lab {
	public static void main(String[] args)throws Exception {
		try (FileInputStream Fis=new FileInputStream("F:\\FILE\\EXP\\info.txt");
			  ObjectInputStream Ois=new ObjectInputStream(Fis);
				){
			Object obj=Ois.readObject();
			System.out.println(obj);
			System.out.println("Object Deserialized");
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
