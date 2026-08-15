package com.example.razorpay.service;

import java.time.LocalDate;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;

@Service
public class UserService {
	@Value("${razorpay.key.id}")
	private String id;
	@Value("${razorpay.key.secret}")
	private String secret;
	
	public Object payment(int amnt) throws RazorpayException {
		RazorpayClient razorpayClient = new RazorpayClient(id, secret);
		JSONObject jsonobject=new JSONObject();
		jsonobject.put("amount", amnt*100);
		jsonobject.put("currency", "INR");
		jsonobject.put("receipt", "txn_123456");
		jsonobject.put("time", LocalDate.now());
		
		Order order= razorpayClient.orders.create(jsonobject);
		return order.toString();
	}
}
