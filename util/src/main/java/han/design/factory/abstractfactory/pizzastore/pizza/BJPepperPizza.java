package han.design.factory.abstractfactory.pizzastore.pizza;

public class BJPepperPizza  extends Pizza {

    public void prepare() {
        setName("北京的胡椒披萨");
        System.out.println("北京的胡椒披萨，设置原材料");
    }
}
