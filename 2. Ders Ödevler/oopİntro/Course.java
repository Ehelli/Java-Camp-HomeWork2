package oop�ntro;

public class Course {
	
	public Course(String name, String teacherName, 	int whatPercentIsComplete, int courseLength /*imza*/) {
		
		this.name = name;
		this.teacherName = teacherName;
		this.whatPercentIsComplete = whatPercentIsComplete;
		this.courseLength = courseLength;
	
	}
	
	//D��ardan eri�ti�imiz alan (Sim�lasyon)
	String name; //Kursun �smi
	String teacherName; //Kursun ��retmeninin ismi
	int whatPercentIsComplete; //Kursun ne kadar� tamamland�
	int courseLength; //Kurs S�resi

}
