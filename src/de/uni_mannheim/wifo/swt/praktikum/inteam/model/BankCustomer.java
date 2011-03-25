/**
 * 
 */
package de.uni_mannheim.wifo.swt.praktikum.inteam.model;

import java.util.Date;

/**
 * @author paddy
 *
 */
public class BankCustomer {

	private int customerID;
	private String surname;
	private String prename;
	private String username;
	private String password;
	private String address;
	private String email;
	private Date Startdate;
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPrename() {
		return prename;
	}
	public void setPrename(String prename) {
		this.prename = prename;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getStartdate() {
		return Startdate;
	}
	public void setStartdate(Date startdate) {
		Startdate = startdate;
	}
	
	
}
