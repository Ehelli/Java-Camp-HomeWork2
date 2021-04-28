package oopİntro;
// iş yapan sınıfın sintax ı nasıl yazılır

public class CourseManager {
	public void register (Course course) {
		System.out.println(course.name + "  programina kaydiniz gerçeklestirildi");
		System.out.println("Ögretmeniniz : " + course.teacherName);
		System.out.println("Kursunuzun %"+course.whatPercentIsComplete+ " tamamlandı.");
		System.out.println("Kursunuz "+course.courseLength+" derstir.");
	}

}
