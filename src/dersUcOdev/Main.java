package dersUcOdev;

public class Main {

	public static void main(String[] args) {

		Student student = new Student();
		student.setFirstName("Huriye");
		student.setLastName("�elik");

		Instructor instructor = new Instructor();
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiro�");

		UserManager userManager = new UserManager();
		User[] users = { student, instructor };
		userManager.addMultiple(users);
		userManager.girisYap(student);


	}

}
