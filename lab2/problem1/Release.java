package lab1;

import java.util.List;

public class Release {

    public Release() {
    }
    private List<Sprint> sprints;
    private Release release;
    
	public List<Sprint> getSprints() {
		return sprints;
	}
	public void setSprints(List<Sprint> sprints) {
		this.sprints = sprints;
	}
	public Release getRelease() {
		return release;
	}
	public void setRelease(Release release) {
		this.release = release;
	}

    
    
}