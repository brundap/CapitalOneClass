package com.capitalone.bean;

public class ERSUserRole {

	private int ers_user_role_id;
	private String user_role;

	public ERSUserRole() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ERSUserRole(int ers_user_role_id, String user_role) {
		super();
		this.ers_user_role_id = ers_user_role_id;
		this.user_role = user_role;
	}

	public int getErs_user_role_id() {
		return ers_user_role_id;
	}

	public void setErs_user_role_id(int ers_user_role_id) {
		this.ers_user_role_id = ers_user_role_id;
	}

	public String getUser_role() {
		return user_role;
	}

	public void setUser_role(String user_role) {
		this.user_role = user_role;
	}

	@Override
	public String toString() {
		return "ERSUserRole [ers_user_role_id=" + ers_user_role_id + ", user_role=" + user_role + "]";
	}

}