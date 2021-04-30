package dersUcOdev;

public class Student extends User {

	private String lecture;
	private String homeWork;

	public Student() {
	}

	public Student(String lecture, String homeWork) {
		this.lecture = lecture;
		this.homeWork = homeWork;
	}

	public String getLecture() {
		return lecture;
	}

	public void setLecture(String lecture) {
		this.lecture = lecture;
	}

	public String getHomeWork() {
		return homeWork;
	}

	public void setHomeWork(String homeWork) {
		this.homeWork = homeWork;
	}

}
