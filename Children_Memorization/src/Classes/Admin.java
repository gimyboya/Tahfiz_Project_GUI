package Classes;

public class Admin {
	
	private String name ;
	private long admin_ID ;// Admin ID must start with '1' and consist of 9 digits
	private String pass ;
	private String alternative_pass; //in case of emergency
	
	//no default constructor for security purpose 
	
	public Admin(String name, long admin_ID, String pass, String alternative_pass) {
		super();
		this.name = name;
		if(admin_ID%100000000==1)this.admin_ID = admin_ID;
		this.pass = pass;
		this.alternative_pass = alternative_pass;
	}
	
	
	
	
	//no get or set methods for security purpose
	//suppose to create all accounts just from here 

}
