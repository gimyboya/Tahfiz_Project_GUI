package Classes;

public class Admin {
	
	private String name ;
	private long admin_ID ;
	private String pass ;
	private String alternative_pass;
	
	public Admin(String name, long admin_ID, String pass, String alternative_pass) {
		super();
		this.name = name;
		this.admin_ID = admin_ID;
		this.pass = pass;
		this.alternative_pass = alternative_pass;
	}
	
	
	//no get or set methods for security purpose
	//suppose to create all accounts just from here 

}