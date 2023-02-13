package refactoringisawithhasa;

import java.util.ArrayList;

public class Student{
	
	private String studentName;
	private String studentId;
	
	private Subject majorSubject;
	private ArrayList<Subject> subjectList = new ArrayList<Subject>();
	
	public Student(String studentName, String studentId, String majorSubjectName, int majorCode) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.majorSubject = new Subject(majorSubjectName, majorCode);
		subjectList.add(this.majorSubject);
	}
	
	public void addSubject(String subjectName, int subjectCode) {
		Subject subject = new Subject(subjectName, subjectCode);
		subjectList.add(subject);
	}
	
	public void setSubjectScore(int subjectCode, int score) {
		for(Subject subject : subjectList) {
			int code = subject.getSubjectCode();
			if(subjectCode == code) {
				subject.setScore(score);
				return;
			}
		}
		
		System.out.println("no subject");
	}
	
	public void getReport() {
		int total = 0;
		
		System.out.println(studentName + "���� ���������� " + majorSubject.getSubjectName() + "�̰�, ������ : " + majorSubject.getScore() + "�Դϴ�.");
	
		for(Subject subject : subjectList) {
			System.out.println(subject.getSubjectName() + " : " + subject.getScore());
			total += subject.getScore();
		}
		
		System.out.println("total : " + total);
	}

	
}
