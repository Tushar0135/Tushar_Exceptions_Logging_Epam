package org.example.Intrest;

public class SI extends Intrest{
    public SI(int principal, int rate, int time)

    {
        super(principal, time, rate);
    }
    public double calculate_simpleInterest()

    {
        return (principal*time*rate)/100.0;
    }
}
