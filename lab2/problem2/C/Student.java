package lab2.problem2.C;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private String name;
	private List<Section> sections= new ArrayList<Section>();
	
	public Student(String name){
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Section> getSections() {
		return sections;
	}
	public void setSections(List<Section> sections) {
		this.sections = sections;
	}
	
	
}
