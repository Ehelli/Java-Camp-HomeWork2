package oopÝntro;

public class Course {
	
	public Course(String name, String teacherName, 	int whatPercentIsComplete, int courseLength /*imza*/) {
		
		this.name = name;
		this.teacherName = teacherName;
		this.whatPercentIsComplete = whatPercentIsComplete;
		this.courseLength = courseLength;
	
	}
	
	//Dýþardan eriþtiðimiz alan (Simülasyon)
	String name; //Kursun Ýsmi
	String teacherName; //Kursun üðretmeninin ismi
	int whatPercentIsComplete; //Kursun ne kadarý tamamlandý
	int courseLength; //Kurs Süresi

}
