/*
 * User.java
 * The Java class represents a JavaBean.
 */package helper;

/**
 *
 * @author vincent
 */
public class User {
    private String name;
	private String age;

	public User(String name, String age){
		this.name = name;
		this.age = age;
	}

	public String getUsername() {
		return name;
	}

	public void setUsername(String name) {
		this.name = name;
	}

	public String getPassword() {
		return age;
	}

	public void setPassword(String age) {
		this.age = age;
	}
    
}
