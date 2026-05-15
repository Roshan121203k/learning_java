import java.time.LocalDate;
import java.util.List;

public class Project {
	private String projectName;
	private String projectManager;
	private List<String> teamMembers;
	private LocalDate startDate;
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getProjectManager() {
		return projectManager;
	}
	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}
	public List<String> getTeamMembers() {
		return teamMembers;
	}
	public void setTeamMembers(List<String> teamMembers) {
		this.teamMembers = teamMembers;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public Project(String projectName, String projectManager, List<String> teamMembers, LocalDate startDate) {
		super();
		this.projectName = projectName;
		this.projectManager = projectManager;
		this.teamMembers = teamMembers;
		this.startDate = startDate;
	}
	@Override
	public String toString() {
		return "Project [projectName=" + projectName + ", projectManager=" + projectManager + ", teamMembers="
				+ teamMembers + ", startDate=" + startDate + "]";
	}
	
	
	
	
	
}
