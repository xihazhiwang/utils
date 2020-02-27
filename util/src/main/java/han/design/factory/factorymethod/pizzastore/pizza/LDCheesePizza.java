package han.design.factory.factorymethod.pizzastore.pizza;

public class LDCheesePizza extends Pizza {

    public void prepare() {
        setName("伦敦的奶酪披萨");
        System.out.println("伦敦的奶酪披萨，设置原材料");
    }
}
