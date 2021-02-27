public class CommissionEmployeee extends AbstractEmployee{

    private double grossSales;
    private  double commissionRate;

    public CommissionEmployeee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        if(grossSales < 0.0){throw new IllegalArgumentException("Gross sales suppose pass 0 na!");}
        if(commissionRate <= 0.0 || commissionRate >= 1.0){throw  new IllegalArgumentException("The commission gas dey between 0 and 1 na, boss");}
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public  void setGrossSales(double grossSales){
        if(commissionRate <= 0.0 || commissionRate >= 1.0){throw  new IllegalArgumentException("The commission gas dey between 0 and 1 na, boss");}
        this.grossSales = grossSales;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0) {throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");}
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    @Override
    public  double earnings (){

        return  getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
    return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
            "commission employee", super.toString(),
            "gross sales", getGrossSales(),
            "commission rate", getCommissionRate());
}
}