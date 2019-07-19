package com.lambdaschool;

public class Penny extends Money
{

    public Penny(int amount)
    {
        super(amount);
        value = .01;
    }

    public Penny()
    {
        value = .01;
    }

    @Override
    public String getNameValue()
    {
        if(amount > 1)
        {
            return amount + " Pennies";
        }
        else
        {
            return amount + " Penny";
        }
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
