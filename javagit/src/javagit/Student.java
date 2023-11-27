package javagit;

public class Student {
	String name, address, phone, email ;
	
	public Student(String name) {
		this.name=name;
	}
	
	public Student(String name, String address, String phone, String email) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return name + " " + address + " "+ phone + " " + email;
	}

	@Override
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true;
	    }
	    if (obj == null || getClass() != obj.getClass()) {
	        return false;
	    }
	    Student otherStudent = (Student) obj;
	    return name.equals(otherStudent.name) &&
	            address.equals(otherStudent.address) &&
	            phone.equals(otherStudent.phone) &&
	            email.equals(otherStudent.email);
	}
	
}