package refactoringisawithhasa;

public class Main {
	public static void main(String[] args) {
		Student studentLee = new Student("Lee", "12345", "국어국문", 100);
		Student studentKim = new Student("Kim", "67890", "영어영문", 200);
		
		studentLee.addSubject("수학",  300);
		studentLee.setSubjectScore(100, 90);
		studentLee.setSubjectScore(300, 100);
		
		studentKim.addSubject("수학",  300);
		studentKim.setSubjectScore(200, 100);
		studentKim.setSubjectScore(300, 70);
		
		studentLee.getReport();
		studentKim.getReport();
	}
}
