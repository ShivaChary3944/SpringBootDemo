package edu.aspire.boot.helloworld;

public class HelloWorldBean 

{
	private String message;
	//private Date date;
	
	
	public HelloWorldBean(String message) {
		super();
		this.message = message;
		
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}
	

}
