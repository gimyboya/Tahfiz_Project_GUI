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
	public Parent(String ID, String pass, String name, String phone, String e_mail, String address,String ralationship) {
		super(pass, name, phone, e_mail, address);
		if(checkParentID(ID)){
			this.ID = ID;
		}
		else {
			OkAlert.display("Error", "Parent account can't be created check ID");
			throw new IllegalArgumentException();

		}
		this.relationship = ralationship;
		
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
	
	//overriding 
	public void setID(String iD) {
        if(checkParentID(ID)){
            super.ID = ID;
        }
        else {
            OkAlert.display("Error", "Wrong ID, ID should start with 3");
            throw new IllegalArgumentException();

        }
		
	}

	public boolean checkParentID (String id){

		return id.matches("[3]\\d{4}");
	}

}
