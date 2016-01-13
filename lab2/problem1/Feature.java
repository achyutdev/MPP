package lab1;

public class Feature {


    public Feature() {
    }
    private int hourRequired;
    private int percentageRemaining;
    private Developer assignedDeveloper;
    private Sprint sprint;
    private Project project;
    
    
	public int getHourRequired() {
		return hourRequired;
	}
	public void setHourRequired(int hourRequired) {
		this.hourRequired = hourRequired;
	}
	public int getPercentageRemaining() {
		return percentageRemaining;
	}
	public void setPercentageRemaining(int percentageRemaining) {
		this.percentageRemaining = percentageRemaining;
	}
	public Developer getAssignedDeveloper() {
		return assignedDeveloper;
	}
	public void setAssignedDeveloper(Developer assignedDeveloper) {
		this.assignedDeveloper = assignedDeveloper;
	}
	public Sprint getSprint() {
		return sprint;
	}
	public void setSprint(Sprint sprint) {
		this.sprint = sprint;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}

    
}