package com.programs.custommessage;

public class messageDemoMain {

	public static void main(String[] args) {
		MessageDemoOperations demoOperations1 = new MessageDemoOperations();
		demoOperations1.input();
		System.out.println(demoOperations1.messageDemo());
		
		MessageDemoOperations demoOperations2 = new MessageDemoOperations();
		demoOperations2.input();
		System.out.println(demoOperations2.messageDemo());

	}

}
