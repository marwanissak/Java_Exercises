package com.company;
import javafx.scene.paint.Stop;

import java.util.Scanner;
import java.lang.System;
import java.util.ArrayList;
import java.util.List;

 class Prime_factorization {

     static void Prime_factorization_func (int n)
    {
        //Scan user input to stop
        Scanner user_input = new Scanner(System.in);
        String Stop_word ;
        int number = n;
        // a  list of all factors
        List<Integer> factors = new ArrayList<>();


            for (int i = 2; i <= number; i++) {
                while (number % i == 0 ) {
                    //stop the loop

                    factors.add(i);
                    number /= i;
                    System.out.println( number );

                }

            }







    }
}
