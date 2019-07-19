package com.lambdaschool;

public class Dollar extends Money
{


    public Dollar(int amount)
    {
        super(amount);
        value = 1.0;
    }

    public Dollar()
    {
        value = 1.0;
    }

    @Override
    public String getNameValue()
    {
        return "$" + amount;
    }


    @Override
    public String toString()
    {
        return super.toString();
    }
}
