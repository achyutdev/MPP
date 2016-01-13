package lab2.problem2.C;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

	public static void main(String[] args) {

		List<Student> stdlist = new ArrayList<Student>();
		List<Section> seclist = new ArrayList<Section>();

		Student std1 = new Student("StdName1");
		Student std2 = new Student("StdName2");
		Student std3 = new Student("StdName3");

		stdlist.add(std1);
		stdlist.add(std2);
		stdlist.add(std3);

		Section sec1 = new Section(11);
		Section sec2 = new Section(22);
		Section sec3 = new Section(33);

		seclist.add(sec1);
		seclist.add(sec2);
		seclist.add(sec3);

		// using std1
		std1.setSections(seclist);
		System.out.println("\n=======================================");
		System.out.println("Student Name : "+std1.getName() + "\nHis is assigned to following section:");
		for (Section section : std1.getSections()) {
			System.out.println("Section Num : " + section.getSectionNum());
		}
		
		System.out.println("\n=======================================");
		// using sec1
		sec1.setStudents(stdlist);
		System.out.println("Section Name : "+sec1.getSectionNum() + "\nThis section has following student:");
		for (Student student : sec1.getStudents()) {
			System.out.println("Student Name : " + student.getName());
		}
		
		
		
	}

}
