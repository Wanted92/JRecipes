package com.github.jrecipes.models;



import java.sql.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

public class User {

	private int id;
	
	@Size(min=2, message="Your name must be at least 2 characters.")
	@NotNull
	private String name;
	
	@Size(min=2, message="Your surname must be at least 2 characters.")
	@NotNull
	private String surname;
	
	@Size(min=1, message="The nickname is required.")
	private String nickname;
	
	@Email(message="The email doesn't appeare like an email.")
	@NotNull(message="The email is required.")
	@Size(min=3, message="The email doesn't appeare like an email.")
	private String email;
	
	@Size(min=8, message="Your password must be at least 8 characters.")
	@NotNull
	private String password;
	private String nation;
	private String job;
	private Date bornDate;
	
	public User(){
	}

	public User build(){
		User user = new User();
		user.id = this.id;
		user.name = this.name;
		user.surname = this.surname;
		user.nickname = this.nickname;
		user.email = this.email;
		user.password = this.password;
		user.nation = this.nation;
		user.job = this.job;
		user.bornDate = this.bornDate;
		
		return user;
	}

	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}

	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}

	/**
	 * @return the nickname
	 */
	public String getNickname() {
		return nickname;
	}

	/**
	 * @param nickname the nickname to set
	 */
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the nation
	 */
	public String getNation() {
		return nation;
	}

	/**
	 * @param nation the nation to set
	 */
	public void setNation(String nation) {
		this.nation = nation;
	}

	/**
	 * @return the job
	 */
	public String getJob() {
		return job;
	}

	/**
	 * @param job the job to set
	 */
	public void setJob(String job) {
		this.job = job;
	}

	/**
	 * @return the bornDate
	 */
	public Date getBornDate() {
		return bornDate;
	}

	/**
	 * @param bornDate the bornDate to set
	 */
	/*public void setBornDate(java.util.Date bornDate) {
		System.out.println("Prima in Date: " + bornDate);
		this.bornDate = new java.sql.Date(bornDate.getTime());
		System.out.println("Dopo in Sql: " + this.bornDate);
	}*/

	/**
	 * @param bornDate the bornDate to set
	 */
	public void setBornDate(java.sql.Date bornDate) {
		this.bornDate = bornDate;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", surname=" + surname
				+ ", nickname=" + nickname + ", email=" + email + ", password="
				+ password + ", nation=" + nation + ", job=" + job
				+ ", bornDate=" + bornDate + "]";
	}
}
