package lab1;

import java.util.List;

public class Developer {

    public Developer() {
    }

	private List<Feature> assignedFeatures;
    private int developerId;
    
    
	public List<Feature> getAssignedFeatures() {
		return assignedFeatures;
	}
	public void setAssignedFeatures(List<Feature> assignedFeatures) {
		this.assignedFeatures = assignedFeatures;
	}
	public int getDeveloperId() {
		return developerId;
	}
	public void setDeveloperId(int developerId) {
		this.developerId = developerId;
	}
    
}