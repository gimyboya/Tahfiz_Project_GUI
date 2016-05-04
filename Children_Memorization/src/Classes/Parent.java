package Classes;

import java.util.Date;

public class Parent extends Account{
	
	private String relationship;
	private Child [] his_children ;
	public Parent() {
		super();
		relationship = null ;
		his_children = null ;
	}
	public Parent(long iD, String pass, String name, String phone, String e_mail, Date dOB, String address,
			char gender,String ralationship,Child[] his_children) {
		super(iD, pass, name, phone, e_mail, dOB, address, gender);
		this.relationship = ralationship;
		this.his_children = his_children; 
	}
	
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	public Child[] getHis_children() {
		return his_children;
	}
	public void setHis_children(Child[] his_children) {
		this.his_children = his_children;
	}
	
	
	

}
