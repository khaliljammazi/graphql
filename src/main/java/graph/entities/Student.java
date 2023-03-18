package graph.entities;

public class Student {
	private final String cin;
	private final String fullname;
	private final String email;
	
	public Student(String cin, String fullname, String email) {
		super();
		this.cin = cin;
		this.fullname = fullname;
		this.email = email;
	}

	public String getCin() {
		return cin;
	}

	public String getFullname() {
		return fullname;
	}

	public String getEmail() {
		return email;
	}
	
}
