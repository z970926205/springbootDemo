package com.example.demo.jinx.personal;

import java.util.List;

import com.example.demo.jinx.general.SysRole;

public class PersonalEntity{
	private Integer id;
	private String userName;
	private String password;
	private String newPassword;
	private String userImage;
	private String sex;
	private String phone;
	private String email;
	private String birthday;
	private String mender;
	private String updateDate;
	private String creator;
	private String createDate;
	private List<SysRole> roles;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserImage() {
		return userImage;
	}

	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getMender() {
		return mender;
	}

	public void setMender(String mender) {
		this.mender = mender;
	}

	public String getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(String updateDate) {
		this.updateDate = updateDate;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public List<SysRole> getroles() {
		return roles;
	}

	public void setroles(List<SysRole> roles) {
		roles = roles;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	@Override
	public String toString() {
		return "PersonalEntity [id=" + id + ", userName=" + userName
				+ ", password=" + password + ", newPassword=" + newPassword
				+ ", userImage=" + userImage + ", sex=" + sex + ", phone="
				+ phone + ", email=" + email + ", birthday=" + birthday
				+ ", mender=" + mender + ", updateDate=" + updateDate
				+ ", creator=" + creator + ", createDate=" + createDate
				+ ", roles=" + roles + "]";
	}

	
	
}
