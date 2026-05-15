
package com.training.org;

public class Organization {
	private String deptId;
	private String deptName;
	private String deptLocation;
	
	
	public Organization() {
		super();
		System.out.println("organization default constructor");
	}
	@Override
	public String toString() {
		return "Organization [deptId=" + deptId + ", deptName=" + deptName + ", deptLocation=" + deptLocation + "]";
	}
	public Organization(String deptId, String deptName, String deptLocation) {
		super();
		System.out.println("organization parameterized construuctor");
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptLocation = deptLocation;
	}
	public String getDeptId() {
		return deptId;
	}
	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptLocation() {
		return deptLocation;
	}
	public void setDeptLocation(String deptLocation) {
		this.deptLocation = deptLocation;
	}
	
	
}
