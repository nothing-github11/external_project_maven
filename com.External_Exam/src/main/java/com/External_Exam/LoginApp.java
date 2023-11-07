package com.External_Exam;

import java.util.ResourceBundle;

public class LoginApp {
	
	public int CheckVoteEligibility(int age) {
		ResourceBundle rb = ResourceBundle.getBundle("config");
		
		//1=vaild , 0=Invalid
		if(age<0 || age>100) {
			return 0; //INvalid
		}
		else if(age>=18) {
			return 1; //Eligible for the VOTE
		}
		else {
			return 0; //Not eligible for the vote
		}
	}
	
}
