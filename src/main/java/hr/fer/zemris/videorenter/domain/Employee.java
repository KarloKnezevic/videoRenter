package hr.fer.zemris.videorenter.domain;

import javax.persistence.Entity;

@Entity
public class Employee extends Person {
	
	protected boolean admin;
	protected String password;
	protected int salary;
	protected String employmentDate;
	
	public boolean isAdmin() {
		return admin;
	}
	
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getEmploymentDate() {
		return employmentDate;
	}
	
	public void setEmploymentDate(String employmentDate) {
		this.employmentDate = employmentDate;
	}
}