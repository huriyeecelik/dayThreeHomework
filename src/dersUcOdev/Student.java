package dersUcOdev;

public class Student extends User {

	private String lecture;
	private String homework;

	public Student() {
	}

	public Student(String lecture, String homework) {
		this.lecture = lecture;
		this.homework = homework;
	}

	public String getLecture() {
		return lecture;
	}

	public void setLecture(String lecture) {
		this.lecture = lecture;
	}

	public String getHomework() {
		return homework;
	}

	public void setHomework(String homework) {
		this.homework = homework;
	}

}
