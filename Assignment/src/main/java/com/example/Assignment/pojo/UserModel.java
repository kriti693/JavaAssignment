
package com.example.Assignment.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "User")

public class UserModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "UId")
	private Integer uId;

	@OneToOne(fetch = FetchType.LAZY)
	private RoleModel rId;

	@Column(name = "UName")
	private String uName;

	@Column(name = "password")
	private String password;

	public UserModel() {

	}

	public UserModel(Integer uId, RoleModel rId, String uName, String password) {
		super();
		this.uId = uId;
		this.rId = rId;
		this.uName = uName;
		this.password = password;
	}

	public Integer getuId() {
		return uId;
	}

	public void setuId(Integer uId) {
		this.uId = uId;
	}

	public RoleModel getrId() {
		return rId;
	}

	public void setrId(RoleModel rId) {
		this.rId = rId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
