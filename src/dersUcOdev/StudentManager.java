package dersUcOdev;

public class StudentManager extends UserManager {

	@Override
	public void girisYap(User user) {
		System.out.println("��renci Giri� Yapt� : " + user.getFirstName() + " " + user.getLastName());
	}
	public void dersListele() {
		System.out.println("Dersler Listelendi");
	}
}
