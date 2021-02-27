public class BPCEmployee  extends  CommissionEmployeee{
    private double baseSalary;


    public BPCEmployee(String firstName, String lastName,
                       String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
                    super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
                    if(baseSalary < 0){throw new IllegalArgumentException("Base salary has to be greater than 0"); }
                    this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0){throw new IllegalArgumentException("Base salary has to be greater than 0"); }
        this.baseSalary = baseSalary;
    }


    public double getBaseSalary() {return baseSalary;}

    @Override
    public double earnings() {
    return  getBaseSalary() * getCommissionRate();
    }

    @Override
    public String toString() {
        return String.format("%s %s; %s: $%,.2f",
                "base-salaried", super.toString(),
                "base salary", getBaseSalary());
    }
}
