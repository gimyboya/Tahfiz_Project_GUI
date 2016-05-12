package Classes;

public class Admin {
	
	private String name ;
	private int admin_ID ;// Admin ID must start with '1' and consist of 5 digits
	private String pass ;
	
	//no default constructor for security purpose 
	
	public Admin(String name, int admin_ID, String pass) {
		super();
		this.name = name;
		if(admin_ID%10000==1){
			this.admin_ID = admin_ID;
		}
		else {
			OkAlert.display("Error", "Admin account can't be created check ID");
		}
		this.pass = pass;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAdmin_ID() {
		return admin_ID;
	}

	public void setAdmin_ID(int admin_ID) {
		this.admin_ID = admin_ID;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
}
