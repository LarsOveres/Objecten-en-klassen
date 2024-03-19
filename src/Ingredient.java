class Ingredients {

    //    Variable
    private double amount;
    //    Variable
    private String unit;
    //    Variable
    private String name;

    //    Lege constructor
    public Ingredients() {
    }

    //    Constructor
    public Ingredients(double amount, String unit, String name) {
        this.amount = amount;
        this.unit = unit;
        this.name = name;
    }

    //    Getter
    double getAmount() {
        return amount;
    }

    //    Setter
    void setAmount(double newAmount) {
        this.amount = newAmount;
    }

    //    Getter
    String getUnit() {
        return unit;
    }

    //    Setter
    void setUnit(String newUnit) {
        this.unit = newUnit;
    }

    //    Getter
    String getName() {
        return name;
    }

    //    Setter
    void setName(String newName) {
        this.name = newName;
    }

}