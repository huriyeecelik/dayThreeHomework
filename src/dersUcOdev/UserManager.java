package dersUcOdev;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullanýcý eklendi : " + user.getFirstName() + " " + user.getLastName());
	}

	public void addMultiple(User[] user) {
		for (User user2 : user) {
			add(user2);
		}

	}

	public void girisYap(User user) {
		System.out.println("Kullanýcý giriþ yaptý : " + user.getFirstName() + " " + user.getLastName());
	}

}
