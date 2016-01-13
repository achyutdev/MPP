package lab2.problem2.A;

public class Student {
	private String name;
	private GradeReport gradeReport;

	public void showName() {
		System.out.println("Name is "+ name);
	}

	public void setName(String name) {
		this.name = name;
	}	
	
	public GradeReport getGradeReport() {
		return gradeReport;
	}

	public void setGradeReport(GradeReport gradeReport) {
		this.gradeReport = gradeReport;
	}
	
}
