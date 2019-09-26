package com.company;

import java.text.DecimalFormat;

public class PI {
    public static void PI_calc() {
        //PI
        DecimalFormat test = new DecimalFormat("#.00000000");
        System.out.println(test.format(Math.PI));
    }

}
