package java_homework;

class Teacher {
	int id;
	String name, address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}

class Student extends Teacher {
	int marks;

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

}

public class InheritanceDemo {
	public static void main(String[] args) {
		Student st = new Student();
		st.setId(10);
		st.setName("PK");
		st.setAddress("2122 arks st");
		st.setMarks(100);

		System.out.println(st.getId());
		System.out.println(st.getName());
		System.out.println(st.getAddress());
		System.out.println(st.getMarks());
	}
}
