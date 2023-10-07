package com.tha103.newview.admin.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import com.google.gson.annotations.Expose;
import com.tha103.newview.discount.model.DiscountVO;

@Entity
@Table(name="administrator")
public class AdminVO {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="adminID" , updatable = false)
	private Integer adminID;
	
	@Column(name="adminName")
	private String adminName;
	
	@Column(name="adminAccount")
	private String adminAccount;
	
	@Column(name="adminPassword")
	private String adminPassword;
	
	@Column(name="adminEmail")
	private String adminEmail;
	
	@Expose
	@OneToMany(mappedBy = "adminID", cascade = CascadeType.ALL)
	@OrderBy("adminID")
	private Set<DiscountVO> discountVOs;

	public AdminVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getAdminID() {
		return adminID;
	}

	public void setAdminID(Integer adminID) {
		this.adminID = adminID;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getAdminAccount() {
		return adminAccount;
	}

	public void setAdminAccount(String adminAccount) {
		this.adminAccount = adminAccount;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public Set<DiscountVO> getDiscountVOs() {
		return discountVOs;
	}

	public void setDiscountVOs(Set<DiscountVO> discountVOs) {
		this.discountVOs = discountVOs;
	}

	@Override
	public String toString() {
		return "AdminVO [adminID=" + adminID + ", adminName=" + adminName + ", adminAccount=" + adminAccount
				+ ", adminPassword=" + adminPassword + ", adminEmail=" + adminEmail + ", discountVOs=" + discountVOs
				+ "]";
	}
	
	
	
}
