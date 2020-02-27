package han.design.factory.abstractfactory.pizzastore.order;

import han.design.factory.abstractfactory.pizzastore.pizza.BJCheesePizza;
import han.design.factory.abstractfactory.pizzastore.pizza.BJPepperPizza;
import han.design.factory.abstractfactory.pizzastore.pizza.Pizza;

public class BJFactory extends AbstractFactory {

    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式");
        if ("pepper".equals(orderType)) {
            return new BJPepperPizza();
        }
        if ("cheese".equals(orderType)) {
            return new BJCheesePizza();
        }
        return null;
    }
}
