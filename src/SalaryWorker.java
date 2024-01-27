public class SalaryWorker extends Worker{

    double annualSalary;

    public SalaryWorker(String ID, String firstName, String lastName, String title, int YOB, double hourlyPayRate, double annualSalary) {
        super(ID, firstName, lastName, title, YOB, hourlyPayRate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked)
    {
        return (annualSalary / 52);
    }

    @Override
    public String displayWeeklyPay(double hoursWorked)
    {
        System.out.println("Weekly Pay (A Fraction of the Annual Salary): $" + String.format("%.2f", calculateWeeklyPay(hoursWorked)));
        return "";
    }
}