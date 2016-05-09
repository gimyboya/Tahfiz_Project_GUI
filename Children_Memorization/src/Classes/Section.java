package Classes;
import java.util.Timer;

public class Section {
	private String name ;
	private int section_number ;
	private int number_of_student;
	private int range_age_from;
	private int range_age_to;
	private int min_amount_of_hifz;//the amount of new memorization
	private int min_amount_of_moragah;//the amount revision of memorization
	private String time ; //time library 
	private Teacher facilator ; 
	private Child [] students_in_section ;
	
	public Section(){
		name = null ;
		section_number = 0;
		number_of_student = 0;
		range_age_from = 0;
		range_age_to = 0;
		min_amount_of_hifz = 0;
		min_amount_of_moragah = 0;
		time = null ;
		facilator = null ;
		students_in_section = null ;
		//prombt "you have create an empty section"
		
	}
	
	public Section(String name, int section_number, int number_of_student, int range_age_from, int range_age_to,
			int min_amount_of_hifz, int min_amount_of_moragah, String time) {
		
		this.name = name;
		this.section_number = section_number;
		this.number_of_student = number_of_student;
		this.range_age_from = range_age_from;
		this.range_age_to = range_age_to;
		this.min_amount_of_hifz = min_amount_of_hifz;
		this.min_amount_of_moragah = min_amount_of_moragah;
		this.time = time;
		
		//prombt "you have create (section name) section"
	}
	
//get/set methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSection_number() {
		return section_number;
	}

	public void setSection_number(int section_number) {
		this.section_number = section_number;
	}

	public int getNumber_of_student() {
		return number_of_student;
	}

	public void setNumber_of_student(int number_of_student) {
		this.number_of_student = number_of_student;
	}

	public int getRange_age_from() {
		return range_age_from;
	}

	public void setRange_age_from(int range_age_from) {
		this.range_age_from = range_age_from;
	}

	public int getRange_age_to() {
		return range_age_to;
	}

	public void setRange_age_to(int range_age_to) {
		this.range_age_to = range_age_to;
	}

	public int getMin_amount_of_hifz() {
		return min_amount_of_hifz;
	}

	public void setMin_amount_of_hifz(int min_amount_of_hifz) {
		this.min_amount_of_hifz = min_amount_of_hifz;
	}

	public int getMin_amount_of_moragah() {
		return min_amount_of_moragah;
	}

	public void setMin_amount_of_moragah(int min_amount_of_moragah) {
		this.min_amount_of_moragah = min_amount_of_moragah;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Teacher getFacilator() {
		return facilator;
	}

	public void setFacilator(Teacher facilator) {
		this.facilator = facilator;
	}

	public Child[] getStudents_in_section() {
		return students_in_section;
	}

	public void setStudents_in_section(Child[] students_in_section) {
		this.students_in_section = students_in_section;
	} 
	
	//other methods 
	String add_student(Child new_student){
		
		if(new_student.getAge()> range_age_to &&
				new_student.getAge() < range_age_from)return "age is out of range";
			if(number_of_student >= 30 )return "the section is full";
			//the maximum number of students in each section is 30 
		number_of_student++;
		students_in_section[students_in_section.length+1]=new_student;
		return "student is successfully added";	
		
	}
	
	
	
	
}
