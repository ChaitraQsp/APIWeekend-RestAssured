package pojoclass;

public class UserLibrary {
	
	//Declare the variables globally
	String name;
	String job;
	
	//Create constructor to initialize
	public UserLibrary(String name, String job) {
		this.name = name;
		this.job = job;
	}

	//Provide getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	
	
	
	
}
