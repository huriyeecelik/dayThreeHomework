package dersUcOdev;

public class InstructorManager extends UserManager {

	@Override
	public void girisYap(User user) {
		System.out.println("E�itmen Giri� Yapt� : "+user.getFirstName() + " " + user.getLastName());
	}

	public void odevEkle() {
		System.out.println("�devler y�klendi.");
	}

}
