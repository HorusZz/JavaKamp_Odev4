
public class Members {

	
	private int id;
	String userName;
	String password;
	String email;
	String nationalIdentit; 
	String firstName;
	String lastName;
	double yearofbirth;
	
	public Members(int id, String userName, String password, String email, String nationalIdentit, String firstName,
			String lastName, double yearofbirth) {

		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.nationalIdentit = nationalIdentit;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearofbirth = yearofbirth;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNationalIdentit() {
		return nationalIdentit;
	}

	public void setNationalIdentit(String nationalIdentit) {
		this.nationalIdentit = nationalIdentit;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getYearofbirth() {
		return yearofbirth;
	}

	public void setYearofbirth(double yearofbirth) {
		this.yearofbirth = yearofbirth;
	}

	public int getId() {
		return id;
	}
	
}
