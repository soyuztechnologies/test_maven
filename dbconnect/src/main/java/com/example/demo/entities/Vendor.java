package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.apache.olingo.odata2.api.annotation.edm.EdmEntitySet;
import org.apache.olingo.odata2.api.annotation.edm.EdmEntityType;
import org.apache.olingo.odata2.api.annotation.edm.EdmKey;
import org.apache.olingo.odata2.api.annotation.edm.EdmNavigationProperty;
import org.apache.olingo.odata2.api.annotation.edm.EdmNavigationProperty.Multiplicity;
import org.apache.olingo.odata2.api.annotation.edm.EdmProperty;
import org.hibernate.annotations.GenericGenerator;

@EdmEntitySet
@EdmEntityType
@Entity
@Table(name="VENDOR")
public class Vendor {
	@EdmKey
	@EdmProperty
	@Id
	@Column(nullable=false, name="ID")
	@GeneratedValue(generator="uuid2")
	@GenericGenerator(name="uuid2", strategy="org.hibernate.id.UUIDGenerator")
	public String id;
	@EdmProperty
	@Column(nullable=false, name="COMPANY_NAME")
	public String companyName;
	@EdmProperty
	@Column(nullable=false, name="FIRST_NAME")
	public String firstName;
	@EdmProperty
	@Column(nullable=false, name="LAST_NAME")
	public String lastName;
	@EdmProperty
	@Column(nullable=false, name="WEBSITE")
	public String website;
	@EdmProperty
	@Column(nullable=false, name="EMAILID")
	public String email;
	@EdmProperty
	@Column(nullable=false, name="STATUS")
	public String status;
	@EdmProperty
	@Column(nullable=false, name="GST_NO")
	public String gstNo;
	@EdmNavigationProperty(toType = address.class, toMultiplicity = Multiplicity.MANY)
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="vendor", referencedColumnName="ID")
	private List<address> addresses = new ArrayList<>();
	
	public List<address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<address> addresses) {
		this.addresses = addresses;
	}

	public Vendor() {
		
	}
	
	public Vendor(String id, String companyName, String firstName, String lastName, String website, String email,
			String status, String gstNo) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.website = website;
		this.email = email;
		this.status = status;
		this.gstNo = gstNo;
	}
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGstNo() {
		return gstNo;
	}
	public void setGstNo(String gstNo) {
		this.gstNo = gstNo;
	}
		
	
	
}
