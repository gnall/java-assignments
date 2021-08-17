package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	PrimeSolverService primeSolverService;

	@PostMapping(path = "/primeSolver")
	public String primeSolver(@RequestBody UserInput userInput) {
		String result = "";

		try {
			int userInputInt = Integer.parseInt(userInput.getUserInput());
			boolean[] primes = primeSolverService.sieveOfEratosthenes(userInputInt);

			for (int i = 2; i <= userInputInt; i++) {
				if (primes[i] == true)
					result = result + " " + i;
			}
			
		} catch (Exception e) {
			result = "Bad input from user, cannot convert to an Integer";
		}
		return "UserInput: " + result;
	}
}
