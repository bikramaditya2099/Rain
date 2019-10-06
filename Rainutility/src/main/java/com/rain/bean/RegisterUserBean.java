package com.rain.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class RegisterUserBean {
	@XmlElement(name="userEmail")
private String userEmail;
	@XmlElement(name="password")
private String password;
	@XmlElement(name="firstName")
private String firstName;
	@XmlElement(name="lastName")
private String lastName;
	@XmlElement(name="dob")
private String dob;
	@XmlElement(name="phone")
private String phone;
	@XmlElement(name="gender")
private String gender;
public String getUserEmail() {
	return userEmail;
}
public void setUserEmail(String userEmail) {
	this.userEmail = userEmail;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
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
public String getDob() {
	return dob;
}
public void setDob(String dob) {
	this.dob = dob;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "RegisterUserBean [userEmail=" + userEmail + ", password="
			+ password + ", firstName=" + firstName + ", lastName=" + lastName
			+ ", dob=" + dob + ", phone=" + phone + ", gender=" + gender + "]";
}



}
