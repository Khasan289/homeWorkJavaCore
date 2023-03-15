package transport;

public abstract class Driver {
    private String fullName;
    private boolean licence;
    private int experience;

    public Driver(String fullName, boolean licence, int experience) {
        this.fullName = fullName;
        this.licence = licence;
        this.experience = experience;
    }
    public abstract void startMoving();

    public abstract void finishTheMove();

    public abstract void refuelCar();

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean getLicence() {
        return licence;
    }

    public void setLicence(boolean licence) {
        this.licence = licence;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
