package oop�ntro;

public class Main {

	public static void main(String[] args) {
		
		Course Course1 = new Course("Yazilim geli�tirici yeti�tirme kampi (C# ANGULAR)","Engin Demirog",20,21); //Referans olu�turma
		Course Course2 = new Course("Yaz�l�m geli�tirici yeti�tirme kamp� (JAVA + REACT)", "Engin Demirog",49,16); //Referans olu�turma
		Course Course3 = new Course("Programlamaya giri� i�in temel kurs","Engin Demirog",55,6); //Referans olu�turma
		
		
		
		
		Course [] courses = {Course1, Course2, Course3}; //Bir elemandan olusan Erey
		
		
		
		for (Course course : courses) {
			
			System.out.println(course.name);
			
		}
		
		//Metod1 - metodumuzu her sayfada bu sekilde �agirabiliriz
		CourseManager courseManager = new CourseManager();
		courseManager.register(Course1);
		
		courseManager.register(Course2);
		
		courseManager.register(Course3);
		
		//Metod2 - metodumuzu her sayfada bu �ekilde �a��rabiliriz 
		CommentManager commentManager = new CommentManager();
		commentManager.addComment();

	}

}
