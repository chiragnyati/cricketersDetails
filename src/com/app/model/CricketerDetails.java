package com.app.model;

public class CricketerDetails {


    private int sNo;
	private String name;
    private int age;
    private String bowlingStyle;
    private String battingStyle;
    private String role;
    private String country;
    
    // all setters & getters
	
	// to string
	@Override
	public String toString() {
		return "CricketerDetails [sNo=" + sNo + ", name=" + name + ", age="
				+ age + ", bowlingStyle=" + bowlingStyle + ", battingStyle="
				+ battingStyle + ", role=" + role + ", country=" + country
				+ "]";
	}

	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBowlingStyle() {
		return bowlingStyle;
	}

	public void setBowlingStyle(String bowlingStyle) {
		this.bowlingStyle = bowlingStyle;
	}

	public String getBattingStyle() {
		return battingStyle;
	}

	public void setBattingStyle(String battingStyle) {
		this.battingStyle = battingStyle;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
    
  
    
    



}
