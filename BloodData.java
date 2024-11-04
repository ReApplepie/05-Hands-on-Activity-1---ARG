class BloodData {
    private String bloodType;
    private String rhFactor;

    // Default constructor
    public BloodData() {
        this.bloodType = "O";
        this.rhFactor = "+";
    }

    // Setter for bloodType
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    // Getter for bloodType
    public String getBloodType() {
        return bloodType;
    }

    // Setter for rhFactor
    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }

    // Getter for rhFactor
    public String getRhFactor() {
        return rhFactor;
    }
}
