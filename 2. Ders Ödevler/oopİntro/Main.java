package oopİntro;

public class Main {

	public static void main(String[] args) {
		
		Course Course1 = new Course("Yazilim geliştirici yetiştirme kampi (C# ANGULAR)","Engin Demirog",20,21); //Referans oluşturma
		Course Course2 = new Course("Yazılım geliştirici yetiştirme kampı (JAVA + REACT)", "Engin Demirog",49,16); //Referans oluşturma
		Course Course3 = new Course("Programlamaya giriş için temel kurs","Engin Demirog",55,6); //Referans oluşturma
		
		
		
		
		Course [] courses = {Course1, Course2, Course3}; //Bir elemandan olusan Erey
		
		
		
		for (Course course : courses) {
			
			System.out.println(course.name);
			
		}
		
		//Metod1 - metodumuzu her sayfada bu sekilde çagirabiliriz
		CourseManager courseManager = new CourseManager();
		courseManager.register(Course1);
		
		courseManager.register(Course2);
		
		courseManager.register(Course3);
		
		//Metod2 - metodumuzu her sayfada bu şekilde çağırabiliriz 
		CommentManager commentManager = new CommentManager();
		commentManager.addComment();

	}

}
