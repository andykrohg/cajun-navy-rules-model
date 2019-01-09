package com.redhat.cajun.navy.rules.model;
import java.io.Serializable;

public class Responder implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;

	private String fullname;
	
	private String phoneNumber;
	
	private String location;
	
	private Integer boatCapacity;
	
	private Boolean hasMedical;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getBoatCapacity() {
		return boatCapacity;
	}

	public void setBoatCapacity(Integer boatCapacity) {
		this.boatCapacity = boatCapacity;
	}

	public Boolean getHasMedical() {
		return hasMedical;
	}

	public void setHasMedical(Boolean hasMedical) {
		this.hasMedical = hasMedical;
	}

	@Override
	public String toString() {
		return "Responder [id=" + id + ", fullname=" + fullname + ", phoneNumber=" + phoneNumber + ", location="
				+ location + ", boatCapacity=" + boatCapacity + ", hasMedical=" + hasMedical + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((boatCapacity == null) ? 0 : boatCapacity.hashCode());
		result = prime * result + ((fullname == null) ? 0 : fullname.hashCode());
		result = prime * result + ((hasMedical == null) ? 0 : hasMedical.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((phoneNumber == null) ? 0 : phoneNumber.hashCode());
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
		Responder other = (Responder) obj;
		if (boatCapacity == null) {
			if (other.boatCapacity != null)
				return false;
		} else if (!boatCapacity.equals(other.boatCapacity))
			return false;
		if (fullname == null) {
			if (other.fullname != null)
				return false;
		} else if (!fullname.equals(other.fullname))
			return false;
		if (hasMedical == null) {
			if (other.hasMedical != null)
				return false;
		} else if (!hasMedical.equals(other.hasMedical))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (phoneNumber == null) {
			if (other.phoneNumber != null)
				return false;
		} else if (!phoneNumber.equals(other.phoneNumber))
			return false;
		return true;
	}
}