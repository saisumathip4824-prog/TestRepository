package day29;

class Student {
	static String College = "DBSIT";
	String Studentname = "Sumathi";
	int studentnum;
	void display() {
		System.out.println(College);
		System.out.println(Studentname);
	}
}

public class StaticPractice {
	int studentnum = 430;	
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.studentnum = 430);
		
// means non-static we cant access inside static area, but we can access static inside non-static also		
//		System.out.println(studentnum);
		s1.display();
	}
}

