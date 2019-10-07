package employeeApp;

public class HealthPlan {

    private int id;
    private static int maxId = 0;
    private String name;

    public HealthPlan(String name) {
        maxId++;
        this.id = maxId;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

}