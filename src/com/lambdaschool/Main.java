package com.lambdaschool;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main
{
    private static DecimalFormat fp = new DecimalFormat("$###,###.00");
    private static double myValue;

    public static void main(String[] args)
    {

        ArrayList<Money> piggyBank = new ArrayList<Money>();
        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));

        System.out.println("******* Amount of each item ********");
        piggyBank.forEach(c -> System.out.println(c.getNameValue()));


        System.out.println("\n****** Total in Piggy Bank ******");
        piggyBank.forEach(c-> myValue += c.getTotal());
        System.out.println("The piggy bank holds " + fp.format(myValue));



    }
}
