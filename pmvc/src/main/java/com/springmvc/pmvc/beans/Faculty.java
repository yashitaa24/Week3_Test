package com.springmvc.pmvc.beans;

public class Faculty {
	
	 public Faculty(int id, String name, String email, String password, String mobileNumber) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.password = password;
			this.mobileNumber = mobileNumber;
		}
	
	private int id;
    private String name;
    private String email;
    private String password;
    private String mobileNumber;

    public Faculty() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
