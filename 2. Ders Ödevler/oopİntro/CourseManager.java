package oop�ntro;
// i� yapan s�n�f�n sintax � nas�l yaz�l�r

public class CourseManager {
	public void register (Course course) {
		System.out.println(course.name + "  programina kaydiniz ger�eklestirildi");
		System.out.println("�gretmeniniz : " + course.teacherName);
		System.out.println("Kursunuzun %"+course.whatPercentIsComplete+ " tamamland�.");
		System.out.println("Kursunuz "+course.courseLength+" derstir.");
	}

}
