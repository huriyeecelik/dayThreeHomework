package dersUcOdev;

public class InstructorManager extends UserManager {

	@Override
	public void girisYap(User user) {
		System.out.println("Eðitmen Giriþ Yaptý : "+user.getFirstName() + " " + user.getLastName());
	}

	public void odevEkle() {
		System.out.println("Ödevler yüklendi.");
	}

}
