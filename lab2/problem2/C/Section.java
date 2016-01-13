package lab2.problem2.C;

import java.util.ArrayList;
import java.util.List;

public class Section {
	private int sectionNum;
	private List<Student> students=new ArrayList<Student>();
	
	public Section(int num){
		sectionNum = num;
	}
	public int getSectionNum() {
		return sectionNum;
	}
	public void setSectionNum(int sectionNum) {
		this.sectionNum = sectionNum;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
}
