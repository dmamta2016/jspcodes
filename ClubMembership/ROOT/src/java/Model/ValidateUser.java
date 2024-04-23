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
    public String authenticate(int age) {
		if (age>=25) {
			return "success";
		} else {
			return "failure";
		}
	}
    
}
