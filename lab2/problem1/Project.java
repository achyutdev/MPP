package lab1;

import java.util.*;

public class Project {
    public Project() {
    }
    private String projectId;
    private List<Release> listRelease;
    private List<Feature> features;
    
	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public List<Release> getListRelease() {
		return listRelease;
	}
	public void setListRelease(List<Release> listRelease) {
		this.listRelease = listRelease;
	}
	public List<Feature> getFeatures() {
		return features;
	}
	public void setFeatures(List<Feature> features) {
		this.features = features;
	}
    
    
}