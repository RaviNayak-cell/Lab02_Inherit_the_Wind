public class Worker extends Person {

    private double hourlyPayRate;

    public Worker(String ID, String firstName, String lastName, String title, int YOB) {
        super(ID, firstName, lastName, title, YOB);
    }

    public double getHourlyPayRate()
    {
        return hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked)
    {
        double overtime = 0;
        double regular = 0;
        if (hoursWorked > 40)
        {
            overtime =  (hoursWorked - 40) * (hourlyPayRate * 1.5);
            hoursWorked = 40;
            regular = hoursWorked * hourlyPayRate;
            return overtime + regular;
        }
        else
        {
            regular = hoursWorked * hourlyPayRate;
            return regular;
        }
    }

    public String displayWeeklyPay(double hoursWorked)
    {
        if (hoursWorked > 40)
        {
            System.out.println("Regular Hours Pay: 40.0");
            System.out.println("Regular Pay Total:" + 40 * hourlyPayRate);
            System.out.println("Overtime Hours Pay: " + (hoursWorked - 40));
            System.out.println("Overtime Pay Total " + (hoursWorked - 40) * (hourlyPayRate * 1.5));
            System.out.println("Total Pay: $" + calculateWeeklyPay(hoursWorked));
        }
        else
        {
            System.out.println("Regular Hours: " + hoursWorked);
            System.out.println("Total Pay: $" + calculateWeeklyPay(hoursWorked));
        }
        return "";
    }

}
