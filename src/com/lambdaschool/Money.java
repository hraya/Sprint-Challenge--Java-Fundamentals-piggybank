package com.lambdaschool;

public abstract class Money
{
    int amount  = 1;
    double value;

    public Money( int amount)
    {

        this.amount = amount;


    }

    public Money()
    {

    }


    public abstract String getNameValue();


    public double getTotal()
    {
        return value * amount;
    }

    public int getAmount()
    {
        return amount;
    }

    public void setAmount(int amount)
    {
        this.amount = amount;
    }

    public double getValue()
    {
        return value;
    }

    public void setValue(double value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "Money{" + "amount=" + amount + ", value=" + value + '}';
    }
}

