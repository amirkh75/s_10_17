/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author amirkh
 */
public class s_10_17 {

    
    public static void main(String[] args) {
        Employee[] myEmployees = new Employee[2];
        CompensationModel[] compensationModel = new CompensationModel[] { new SalariedCompensationModel(126000) ,new HourlyCompensationModel(125,126) };
        myEmployees[0] = new SalariedEmployee("amir","jh","12345678910f",compensationModel[0]);
        myEmployees[1] = new HourlyEmployee("amir","jh","12345678910f",compensationModel[1]);
        System.out.println(myEmployees[0].toString());
        System.out.println(myEmployees[1].toString());
    }
    
}
