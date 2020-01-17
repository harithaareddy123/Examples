package com.deloitte.ecommerce.entity;



public class AppUser {
private String Mobile;
private String Password;
private String Name;
private double Balance;

public AppUser(String Mobile, String Password,String Name,double Balance) {
	this.Mobile=Mobile;
			this.Password=Password;
	this.Name=Name;
	this.Balance=Balance;
}

public String getMobile() {
	return Mobile;
}

public void setMobile(String mobile) {
	Mobile = mobile;
}

public String getPassword() {
	return Password;
}

public void setPassword(String password) {
	Password = password;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public double getBalance() {
	return Balance;
}

public void setBlance(double blance) {
	Balance = blance;
}
@Override
public boolean equals(Object obj) {
    if (obj == this) {
        return true;
    }
    if (obj == null || !(obj instanceof AppUser)) {
        return false;
    }
    AppUser user = (AppUser) obj;
    return user.Mobile.equals(this.Mobile);
}

@Override
public int hashCode() {
    return Mobile.hashCode();
}
}

