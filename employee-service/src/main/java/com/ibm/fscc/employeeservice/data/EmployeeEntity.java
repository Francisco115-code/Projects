package com.ibm.fscc.employeeservice.data;

public class EmployeeEntity {

	/*
	 * Shows the attributes of the Employee Entity class for Java Spring Boot
	 * service
	 */
	public EmployeeEntity() {
	}

	// Parameterized Constructor
	// to assign the values
	// to the properties of
	// the entity
	public EmployeeEntity(
			Integer employeeId, String lastName,
			String firstName, String streetAddress, String city, String state, Integer zipcode, Integer birthDate,
			Long cellNumber) {

		super();

		this.employeeId = employeeId;
		this.lastName = lastName;
		this.firstName = firstName;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.birthDate = birthDate;
		this.cellNumber = cellNumber;

	}

	private int employeeId; // primary and generated, Generate with UUID and unique
	private String firstName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private int zipcode;
	private int birthDate;
	private Long cellNumber;

	// Overriding the toString method
	// to find all the values
	@Override
	public String toString() {

		return "Employee [employeeId="
				+ employeeId + ", lastName="
				+ lastName + ", firstName="
				+ firstName + ", streetAddress="
				+ streetAddress + ", city="
				+ city + ", state="
				+ state + ", zipcode,"
				+ zipcode + ", birthDate"
				+ birthDate + ", cellNumber"
				+ cellNumber + "]";

	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zipcode;
	}

	public void setZip(int zipcode) {
		this.zipcode = zipcode;
	}

	public int getbirthDate() {
		return birthDate;
	}

	public int setbirthDate(int birthDate) {
		return birthDate;
	}

	public Long getCellNumber() {
		return cellNumber;
	}

	public Long setCellNumber(Long cellNumber) {
		return cellNumber;
	}
}
