package javagit;

import java.util.Iterator;

public class ManageStudent {
	public static void main(String args[]) {
		Student student[] = null;
		ManageStudent a = new ManageStudent();
		student = a.addStudent();
		a.printStudent(student);
		
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
		student[2] = new Student("Sook", "Seoul", "010XXXXXXXX","ask@godofjava.com");
		return student;
	}
}
