package com.lambdaschool;

public class Dime extends Money
{

    public Dime(int amount)
    {
        super(amount);
        value = .10;
    }

    public Dime()
    {
        value = .10;
    }

    @Override
    public String getNameValue()
    {
        if(amount > 1)
        {
            return amount + " Dimes";
        }
        else
        {
            return amount + " Dime";
        }
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
