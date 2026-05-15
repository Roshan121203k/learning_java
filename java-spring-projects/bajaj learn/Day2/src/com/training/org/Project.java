package com.training.org;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Project {
	@Override
	public String toString() {
		return "Project [projectName=" + projectName + ", clientName=" + clientName + ", techStack="
				+ techStack + ", empAL=" + empAL + ", startDate=" + startDate + "]";
	}
	private String projectName;
	private String clientName;
	public Project() {
		super();
	}
	private List<String> techStack;
	List<Employee> empAL;
	LocalDate startDate;
	
	public Project(String projectName, String clientName, List<String> techStack, List<Employee> empAL,
			LocalDate startDate) {
		super();
		this.projectName = projectName;
		this.clientName = clientName;
		this.techStack = techStack;
		this.empAL = empAL;
		this.startDate = startDate;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public List<String> getTechStack() {
		return techStack;
	}
	public void setTechStack(List<String> techStack) {
		this.techStack = techStack;
	}
	public List<Employee> getEmpAL() {
		return empAL;
	}
	public void setEmpAL(List<Employee> empAL) {
		this.empAL = empAL;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
}
