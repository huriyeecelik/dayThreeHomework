package dersUcOdev;

public class UserManager {
	public void add(User user) {
		System.out.println("Kullan�c� eklendi : " + user.getFirstName() + " " + user.getLastName());
	}

	public void addMultiple(User[] user) {
		for (User user2 : user) {
			add(user2);
		}

	}

	public void girisYap(User user) {
		System.out.println("Kullan�c� giri� yapt� : " + user.getFirstName() + " " + user.getLastName());
	}

}
