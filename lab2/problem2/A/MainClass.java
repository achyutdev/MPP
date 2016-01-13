package lab2.problem2.A;

public class MainClass {

	public static void main(String[] args) {
		Student student = new Student();
		GradeReport report = new GradeReport();
		
		student.setName("Achyut Dev ");
		
		// one direction
		student.setGradeReport(report);
		student.showName();
		student.getGradeReport().showGrade();

		System.out.println("\n");
		
		
		//another direction
		report.setStudent(student);
		report.getStudent().showName();
		report.showGrade();
		
	}

}
