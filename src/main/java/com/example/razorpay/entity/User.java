package com.example.razorpay.entity;

import lombok.Data;

@Data
public class User {
	private int amnt;

	public int getAmnt() {
		return amnt;
	}

	public void setAmnt(int amnt) {
		this.amnt = amnt;
	}

	@Override
	public String toString() {
		return "User [amnt=" + amnt + "]";
	}

}
