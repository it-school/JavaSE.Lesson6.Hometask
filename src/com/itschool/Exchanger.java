package com.itschool;

public class Exchanger
{
    public double getRate()
    {
        return rate;
    }

    public void setRate(double rate)
    {
        this.rate = rate;
    }

    double rate;

    public Exchanger(double rate)
    {
        this.rate = rate;
    }

    public Exchanger()
    {
        this.rate = 26.33;
    }

    public double Hrn2USD(double income)
    {
        return income / this.rate;
    }

    public double Hrn2USD(double income, double rate)
    {
        return income / rate;
    }

    public double USD2Hrn(double income)
    {
        return income * this.rate;
    }

    public double USD2Hrn(double income, double rate)
    {
        return income * rate;
    }




}
