package com.decard.nettty;

import java.text.DecimalFormat;

public class RunJava {

    private static DecimalFormat decimalFormat = new DecimalFormat("0.00");
    private static DecimalFormat decimalFormat1 = new DecimalFormat(".00");

    public static void main(String[] args) {

        float a = 0.01f;
        String format = decimalFormat.format(a);
        String format1 = decimalFormat1.format(a);


        System.out.println("-------------------"+format+"     "+format1);
    }
}
