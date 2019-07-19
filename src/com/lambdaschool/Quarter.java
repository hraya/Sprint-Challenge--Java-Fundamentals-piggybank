package com.lambdaschool;

public class Quarter extends Money
{


    public Quarter(int amount)
    {
        super(amount);
        value = .25;
    }

    public Quarter()
    {
        value = .25;
    }

    @Override
    public String getNameValue()
    {
         if(amount > 1)
         {
             return amount + " Quarters";
         }
         else
         {
             return amount + " Quarter";
         }
    }

    @Override
    public String toString()
    {
        return super.toString();
    }
}
