package com.ibm.fscc.loginservice.data;

public class LoginEntity {

	public LoginEntity() {
	}

	// Parameterized Constructor
	// to assign the values
	// to the properties of
	// the entity
	public LoginEntity(
			String emailId, String password,
			String userName) {

		super();

		this.emailId = emailId;
		this.password = password;
		this.userName = userName;

	}

	private String emailId; // primary key
	private String password; // encrypted
	private String userName; // encrypted

	// Overriding the toString method
	// to find all the values
	@Override
	public String toString() {

		return "Employee [employeeId="
				+ emailId + ", emailId="
				+ password + ", password="
				+ userName + ", userName="
				+ "]";

	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getuserName() {
		return userName;
	}

	public void setuserName(String userName) {
		this.userName = userName;
	}

}
