package org.example.Intrest;

public class CI extends Intrest {
    public CI(int principal, int rate, int time) {
        super(principal, time, rate);
    }
    public double Calculate_CompountI() {
        return principal*Math.pow((1+rate/100.0),time);
    }
}
