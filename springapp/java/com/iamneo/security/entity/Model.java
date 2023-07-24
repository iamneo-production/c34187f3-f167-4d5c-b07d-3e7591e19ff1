package com.iamneo.security.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Model {
    @Id
//    @GeneratedValue
//    private Long id;
    private String vehicleNumber; // You may need to adjust the data type if necessary
    private String name;
    private String email;
    private String dob;
    private String age;
    private String mobile;
    private String policy_type;
    private String payment_type;
    private String renew_type;
    private double amount;

    public Model() {
        super();
    }

    public Model(String name, String vehicleNumber, String email, String dob, String age, String mobile,
            String policy_type, String payment_type, String renew_type, int amount) {
        this.name = name;
        this.vehicleNumber = vehicleNumber;
        this.email = email;
        this.dob = dob;
        this.age = age;
        this.mobile = mobile;
        this.policy_type = policy_type;
        this.payment_type = payment_type;
        this.renew_type = renew_type;
        this.amount = amount;
    }

    // Getters and setters for other fields

    // Define the many-to-one relationship with the User entity using Vehicle_Number as the join column
    
    private User user;

    // Getter and setter for the user field
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPolicy_type() {
		return policy_type;
	}

	public void setPolicy_type(String policy_type) {
		this.policy_type = policy_type;
	}

	public String getPayment_type() {
		return payment_type;
	}

	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}

	public String getRenew_type() {
		return renew_type;
	}

	public void setRenew_type(String renew_type) {
		this.renew_type = renew_type;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double updatedAmount) {
		this.amount = updatedAmount;
	}

	public static Model get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Model get(String id) {
		// TODO Auto-generated method stub
		return null;
	}
    
}

