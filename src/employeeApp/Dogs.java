package employeeApp;

public class Dogs {
    private String breed;
    private int aveWeight;
    private boolean apt;

    public Dogs(String breed, int aveWeight, boolean apt) {
        this.breed = breed;
        this.aveWeight = aveWeight;
        this.apt = apt;

    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setAveWeight(int aveWeight) {
        this.aveWeight = aveWeight;
    };

    public int getAveWeight() {
        return this.aveWeight;
    }

    public void setApt(boolean apt) {
        this.apt = apt;
    }

    public boolean getApt() {
        return this.apt;
    }

    @Override
    public String toString() {
        return "\n dog ====>   {" + this.breed + " " + this.apt + " " + this.aveWeight + "  }";
    }
}