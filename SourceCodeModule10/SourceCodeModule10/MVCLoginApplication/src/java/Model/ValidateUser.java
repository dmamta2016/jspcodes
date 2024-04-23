/*
 * ValidateUser.java
 * The model validates the user details.
 * Copyright (C) 2015 Aptech Software Limited. All right reserved.
 */package Model;

/**
 *
 * @author vincent
 */
public class ValidateUser {
    public String authenticate(String username, String password) {
		if (("admin".equalsIgnoreCase(username)) && ("admin".equals(password))) {
			return "success";
		} else {
			return "failure";
		}
	}
    
}
