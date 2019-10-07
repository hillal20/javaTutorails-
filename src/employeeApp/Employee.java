package employeeApp;

public class Employee {
    private static int maxId = 0;
    private int id;
    private String firstName;
    private String lastName;
    private double salary;
    private boolean has401k;
    private int companyId;
    private int healthPlan;

    public Employee(String firstName, String lastName, double salary, boolean has401k, int companyId, int healthPlan) {
        maxId++;
        this.id = maxId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.has401k = has401k;
        this.companyId = companyId;
        this.healthPlan = healthPlan;
    }

    public String getEmpFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmpLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return this.firstName + "" + this.lastName;
    };

    {

    }
}