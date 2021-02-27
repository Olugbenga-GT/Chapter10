import java.util.Base64;

public class PayrollTest {
    public static void main(String[] args) {

        SalariedEmployee salariedEmployee = new SalariedEmployee("Micheal", "Aderogba", "11-110-XZ", 5500.0);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karen", "Price", "32x-55G", 700.45, 50);
        CommissionEmployeee commissionEmployee = new CommissionEmployeee("Sue", "Jones", "333-33-3333", 10000, .06);
        BPCEmployee basePlusCommissionEmployee = new BPCEmployee("Bob", "Lewis", "444-44-4444", 5000, 0.04, 6550.50 );

        System.out.println("Employees processed individually: ");

        System.out.printf("%n%s%n%s: $%,.2f %n%n", salariedEmployee, "earned" , salariedEmployee.earnings());
        System.out.printf("%n%s%n%s: $%,.2f %n%n", hourlyEmployee, "earned" , hourlyEmployee.earnings());
        System.out.printf("%n%s%n%s: $%,.2f %n%n", commissionEmployee, "earned" , commissionEmployee.earnings());
        System.out.printf("%n%s%n%s: $%,.2f %n%n", basePlusCommissionEmployee, "earned" , basePlusCommissionEmployee.earnings());

        AbstractEmployee[] workman = new AbstractEmployee[4];
        workman[0] = salariedEmployee;
        workman[1] = hourlyEmployee;
        workman[2] = commissionEmployee;
        workman[3] = basePlusCommissionEmployee;

        System.out.printf("Employees shall now be processed polymorphically! %n%n");

        for(AbstractEmployee worker : workman){
            System.out.printf("I am a %s worker", worker);;

            if (worker instanceof BPCEmployee){
                BPCEmployee baseSalaryWorker = (BPCEmployee) worker;
                baseSalaryWorker.setBaseSalary(1.10 * baseSalaryWorker.getBaseSalary());

                System.out.printf("base salary $%,.2f", baseSalaryWorker.getBaseSalary());
            }
            System.out.printf("earned $%,.2f%n %n", worker.earnings());
        }

        for (int number = 0; number < workman.length; number++){
            System.out.printf("Employee %d is a %s  %n", number+1, workman.getClass().getName());
        }





    }
}
