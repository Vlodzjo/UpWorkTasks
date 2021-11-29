public enum PizzaType {

    LARGE(3),
    MEDIUM(2),
    SMALL(1);

    private int pizzaCode;

    PizzaType(int pizzaCode) {
        this.pizzaCode = pizzaCode;
    }

    public int getPizzaCode() {
        return pizzaCode;
    }

    public static PizzaType fromCode(int code) {
        for (PizzaType pizzaType : PizzaType.values()) {
            if (code == pizzaType.getPizzaCode()) {
                return pizzaType;
            }
        }
        throw new RuntimeException("Pizza not found");
    }
}
