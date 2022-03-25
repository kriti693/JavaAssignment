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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "Terminal")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})

public class TerminalModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TId")
	private Integer tId;

	@OneToOne(fetch = FetchType.LAZY)
	@JsonProperty(value = "oId", access = JsonProperty.Access.WRITE_ONLY)
	private OrganzationModel oId;

	@Column(name = "TName")
	private String tName;

	@Column(name = "serialNo")
	private Integer serialNo;

	public TerminalModel() {

	}

	public TerminalModel(Integer tId, OrganzationModel oId, String tName, Integer serialNo) {
		super();
		this.tId = tId;
		this.oId = oId;
		this.tName = tName;
		this.serialNo = serialNo;
	}

	public Integer gettId() {
		return tId;
	}

	public void settId(Integer tId) {
		this.tId = tId;
	}

	public OrganzationModel getoId() {
		return oId;
	}

	public void setoId(OrganzationModel oId) {
		this.oId = oId;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	public Integer getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	}

}
