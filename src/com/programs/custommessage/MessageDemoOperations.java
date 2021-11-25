package com.programs.custommessage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MessageDemoOperations {
	UserDetail detail = UserDetail.getInstance();
	
	public void input() {
		addUsername();
		addPhone();
		getDate();
	}
	
	public String addUsername() {
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter Firstname");
		String fname = sc1.nextLine();
		detail.setfName(fname);
		
		System.out.println("Enter Lastname");
		String lname = sc1.nextLine();
		detail.setlName(lname);
		
		return detail.getfName() + " " + detail.getlName();
	}
	
	public String addPhone() {
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter Phone");
		String phone = sc2.nextLine();
		boolean check = Pattern.matches("^([0-9]{10})$", phone);
		if(check) {
		detail.setPhone(phone);
		}else {
		System.out.println("Enter Valid Number");
		addPhone();
		}

		return phone;
	}
	
	public String getDate() {
		
		LocalDateTime myDateObj = LocalDateTime.now();    
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy");   
	    String formattedDate = myDateObj.format(myFormatObj);
	    detail.setDate(formattedDate);
	    return formattedDate;
	}
	
	public String messageDemo() {
		
		return "Hello " + detail.getfName()+ ", We have your full name as " + detail.getfName() 
		+ " " +detail.getlName() + " in our system. Your contact number is 91-"
		+ detail.getPhone()+"\nPlease, let us know in case of any clarification Thank you BridgeLabz " 
		+ detail.getDate()+ ".";
	}

}
