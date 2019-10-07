package employeeApp;

public class Company {
    private static int maxId = 0;
    private final static double match401k = 0.05;
    public int id;
    private String name;
    private int debt;

    public Company(String name, int debt) {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.debt = debt;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDebt() {
        return this.debt;
    }

    public void setDept(int debt) {
        this.debt = debt;
    }
}