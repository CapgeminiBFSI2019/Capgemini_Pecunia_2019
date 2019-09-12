package com.capgemini.pecunia.model;
import java.sql.Date;
//import java.util.*;

public class Customer {
@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerAadhar == null) ? 0 : customerAadhar.hashCode());
		result = prime * result + ((customerContact == null) ? 0 : customerContact.hashCode());
		result = prime * result + ((customerDob == null) ? 0 : customerDob.hashCode());
		result = prime * result + ((customerGender == null) ? 0 : customerGender.hashCode());
		result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
		result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
		result = prime * result + ((customerPan == null) ? 0 : customerPan.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (customerAadhar == null) {
			if (other.customerAadhar != null)
				return false;
		} else if (!customerAadhar.equals(other.customerAadhar))
			return false;
		if (customerContact == null) {
			if (other.customerContact != null)
				return false;
		} else if (!customerContact.equals(other.customerContact))
			return false;
		if (customerDob == null) {
			if (other.customerDob != null)
				return false;
		} else if (!customerDob.equals(other.customerDob))
			return false;
		if (customerGender == null) {
			if (other.customerGender != null)
				return false;
		} else if (!customerGender.equals(other.customerGender))
			return false;
		if (customerId == null) {
			if (other.customerId != null)
				return false;
		} else if (!customerId.equals(other.customerId))
			return false;
		if (customerName == null) {
			if (other.customerName != null)
				return false;
		} else if (!customerName.equals(other.customerName))
			return false;
		if (customerPan == null) {
			if (other.customerPan != null)
				return false;
		} else if (!customerPan.equals(other.customerPan))
			return false;
		return true;
	}


private String customerId;
private String customerName;
private String customerAadhar;
private String customerPan;
private String customerContact;
private String customerGender;
private Date customerDob;


	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	public String getCustomerId() {
		return customerId;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerAadhar(String  customerAadhar) {
		this. customerAadhar =  customerAadhar;
	}
	
	public String getCustomerAadhar() {
		return customerAadhar;
	}
	
	public void setCustomerPan(String customerPan) {
		this.customerPan = customerPan;
	}
	
	public String getCustomerPan() {
		return customerPan;
	}
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	
	public String getCustomerContact() {
		return customerContact;
	}
	public void setCustomerGender(String customerGender) {
		this.customerGender = customerGender;
	}
	
	public String getCustomerGender() {
		return customerGender;
	}
	public void setCustomerDob(Date customerDob) {
		this.customerDob = customerDob;
	}
	
	public Date getCustomerDob() {
		return customerDob;
	}


	public Customer(String customerName, String customerAadhar, String customerPan, String customerContact,
			String customerGender, Date customerDob) {
		super();
		this.customerName = customerName;
		this.customerAadhar = customerAadhar;
		this.customerPan = customerPan;
		this.customerContact = customerContact;
		this.customerGender = customerGender;
		this.customerDob = customerDob;
//		this.customerId = Integer.toString(this.id);
//		this.id++;

}
}
