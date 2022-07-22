package OOPS;
class Stu{
	static {
		System.out.println("this is Student static block");
	}
	int id;
	String name;
	static String cname="TOPS";
	public Stu(int id,String name) {
		this.id= id;
		this.name=name;
	}
	public void getData() {
		System.out.println("id : "+id+" name: "+name+" cname : "+cname );
	}
	public static void run() {
		System.out.println("this is run method");
	}
}
public class staticKEyword {
	static {
		System.out.println("this is main static block");
	}
	public static void main(String[] args) {
		Stu s1 = new Stu(1, "romit");
		Stu s2 = new Stu(2, "zankhana");
		Stu s3 = new Stu(3, "dhruvi");
		s1.getData();
		s2.getData();
		s3.getData();
		s1.run();
		Stu.run();
	}
}
