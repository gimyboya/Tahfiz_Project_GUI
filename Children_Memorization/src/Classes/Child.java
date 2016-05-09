package Classes;

public class Child {
	
	private long student_ID; //student ID must start with '4' and consist of 9 digits
	private String name ;
	private int age ;
	private Parent first_parent ;
	private Parent second_parent ;
	private String [] alternative_parents; //array of alternative parents' names in case that the main parents are not available 
	private String phone ;
	private float amount_of_hifz; //the totsl amount of memorization which counted with pages 
	
	public Child(){
		student_ID = 0;
		name = null;
		age = 0;
		first_parent = null ;
		second_parent = null;
		alternative_parents = null;
		phone = null;
		amount_of_hifz = 0; 
		//prombt "you have create an empty Child"
	}
	
	public Child(long student_ID, String name, int age, String[] alternative_parents, String phone, float amount_of_hifz) {
		
		if(student_ID%100000000==4)this.student_ID = student_ID;
		this.name = name;
		this.age = age;
		this.alternative_parents = alternative_parents;
		this.phone = phone;
		this.amount_of_hifz = amount_of_hifz;
		//prombt "you have create a (child's name ) child"
		
	}
	
	// get/set methods

	public long getStudent_ID() {
		return student_ID;
	}

	public void setStudent_ID(long student_ID) {
		if(student_ID%100000000==4)this.student_ID = student_ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Parent getFirst_parent() {
		return first_parent;
	}

	public void setFirst_parent(Parent first_parent) {
		this.first_parent = first_parent;
	}

	public Parent getSecond_parent() {
		return second_parent;
	}

	public void setSecond_parent(Parent second_parent) {
		this.second_parent = second_parent;
	}

	public String[] getAlternative_parents() {
		return alternative_parents;
	}

	public void setAlternative_parents(String[] alternative_parents) {
		this.alternative_parents = alternative_parents;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public float getAmount_of_hifz() {
		return amount_of_hifz;
	}

	public void setAmount_of_hifz(float amount_of_hifz) {
		this.amount_of_hifz = amount_of_hifz;
	}
	
	//other methods 
	
	void add_pages(float pages){
		//Round the pages to just one or half page
		//need to complete 
	}
	//overloading 
	void add_pages(int pages){
		amount_of_hifz+=pages;
	}
	
	
	

}
