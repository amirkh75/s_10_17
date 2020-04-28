/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amirkh
 */
public class HourlyCompensationModel implements CompensationModel {
    double wage;
    double hours;

    HourlyCompensationModel(double wage, double hours) {
        this.wage = wage;
        this.hours = hours;
    }
    @Override
    public double earnings() {
        if(hours > 40)
            return wage*40 + wage*(hours-40)*1.5;
        else
            return wage*hours;
    }
    
}
