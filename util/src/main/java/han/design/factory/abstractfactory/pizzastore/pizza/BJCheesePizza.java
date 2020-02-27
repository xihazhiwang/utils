package han.design.factory.abstractfactory.pizzastore.pizza;

public class BJCheesePizza extends Pizza {

    public void prepare() {
        setName("北京的奶酪披萨");
        System.out.println("北京的奶酪披萨，设置原材料");
    }
}
