package han.design.factory.factorymethod.pizzastore.pizza;

public class LDPepperPizza extends Pizza{

    public void prepare() {
        setName("伦敦的胡椒披萨");
        System.out.println("伦敦的胡椒披萨，设置原材料");
    }
}
