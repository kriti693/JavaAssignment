package com.example.Assignment.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "Organzation")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class OrganzationModel {
	


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OId")
	private Integer oId;

	@Column(name = "OName")
	private String oName;

	@Column(name = "ORole")
	private String oRole;

	@ManyToOne(fetch = FetchType.LAZY)
	@JsonProperty(value = "dId", access = JsonProperty.Access.WRITE_ONLY)
	OrganzationModel dId;

	public OrganzationModel() {

	}

	public OrganzationModel(String oName, String oRole, OrganzationModel dId) {
		super();

		this.oName = oName;
		this.oRole = oRole;
		this.dId = dId;
	}

	public Integer getoId() {
		return oId;
	}

	public void setoId(Integer oId) {
		this.oId = oId;
	}
	public String getoName() {
		return oName;
	}

	public void setoName(String oName) {
		this.oName = oName;
	}

	public String getoRole() {
		return oRole;
	}

	public void setoRole(String oRole) {
		this.oRole = oRole;
	}

	public OrganzationModel getdId() {
		return dId;
	}

	public void setdId(OrganzationModel dId) {
		this.dId = dId;
	}

	@Override
	public String toString() {
		return "OrganzationModel [oId=" + oId + ", oName=" + oName + ", oRole=" + oRole + ", dId=" + dId + "]";
	}

}
