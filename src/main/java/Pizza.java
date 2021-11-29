
public class Pizza {

    private double basePrice;
    protected double meatTopping;
    protected double nonMeatTopping;

    public Pizza(double basePrice, double meatTopping, double nonMeatTopping) {
        this.basePrice = basePrice;
        this.meatTopping = meatTopping;
        this.nonMeatTopping = nonMeatTopping;
    }

    public double calculatePizzaPrice(int countOfMeatToppings, int countOfNonMeatTopping, int countOfPizza) {
        return (basePrice + countOfMeatToppings * meatTopping + countOfNonMeatTopping * nonMeatTopping) * countOfPizza;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public double getMeatTopping() {
        return meatTopping;
    }

    public void setMeatTopping(double meatTopping) {
        this.meatTopping = meatTopping;
    }

    public double getNonMeatTopping() {
        return nonMeatTopping;
    }

    public void setNonMeatTopping(double nonMeatTopping) {
        this.nonMeatTopping = nonMeatTopping;
    }
}
