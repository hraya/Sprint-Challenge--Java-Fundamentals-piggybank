package com.lambdaschool;

public class Nickel extends Money
{

    public Nickel(int amount)
    {
        super(amount);
        value = .05;
    }

    public Nickel()
    {
        value = .05;
    }

    @Override
    public String getNameValue()
    {
        if(amount > 1)
        {
            return amount + " Nickels";
        }
        else
        {
            return amount + " Nickel";
        }
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
