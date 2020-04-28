
/**
 *
 * @author amirkh
 */
public class SalariedCompensationModel implements CompensationModel {
    double weeklySalary;

    SalariedCompensationModel(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
    public double get_s(){return this.weeklySalary;}
    @Override
    public double earnings() {
        return weeklySalary;
    }
    
}
