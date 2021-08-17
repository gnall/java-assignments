package com.example.restservice;

import org.springframework.stereotype.Service;

@Service
public class PrimeSolverService {

    public boolean[] sieveOfEratosthenes(int value) {
        boolean primes[] = new boolean[value + 1];

        //Fill array with true
        for (int i = 0; i <= value; i++) {
            primes[i] = true;
        }

        //starting at 2 and while x is less than its square
        for (int x = 2; x * x <= value; x++) {

            if (primes[x] == true) {

                //go through multiples of x and mark them false
                for (int y = x * x; y <= value; y += x) {
                    primes[y] = false;
                }
            }
        }
        return primes;
    }
}
