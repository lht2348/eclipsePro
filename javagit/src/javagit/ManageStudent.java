package javagit;

import java.util.Iterator;

public class ManageStudent {
	public static void main(String args[]) {
		Student student[] = null;
		ManageStudent a = new ManageStudent();
		ManageStudent b = new ManageStudent();
		student = a.addStudent();
		a.printStudent(student);
		b.checkEquals();
		
	}
	
	public void printStudent(Student student[]) {
		for(Student data : student) {
			System.out.println(data);
		}
	}
	
	public Student[] addStudent() {
		Student[] student = new Student[3];
		student[0] = new Student("Lim", "InCheon", null, null);
		student[1] = new Student("Min");
		student[2] = new Student("Sook", "Seoul", "010XXXXXXXX","ask@java.com");
		return student;
	}
	
	public void checkEquals() {
		Student a=new Student("Min","Seoul","010XXXXXXXXX","ask@java.com");
		Student b=new Student("Min","Seoul","010XXXXXXXXX","ask@java.com");
		if(a.equals(b)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
	}
	}
	
}
