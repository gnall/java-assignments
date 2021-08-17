package com.example.restservice;

public class UserInput {

	private final String userInput;

	public UserInput(){
		this.userInput = "";
	}

	public UserInput(String userInput) {
		this.userInput = userInput;
	}

	public String getUserInput() {
		return userInput;
	}
}
