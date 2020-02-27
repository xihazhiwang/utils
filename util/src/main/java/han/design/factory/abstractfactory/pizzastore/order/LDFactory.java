package han.design.factory.abstractfactory.pizzastore.order;

import han.design.factory.abstractfactory.pizzastore.pizza.*;

public class LDFactory extends AbstractFactory {

    public Pizza createPizza(String orderType) {
        System.out.println("使用的是抽象工厂模式");
        if ("pepper".equals(orderType)) {
            return new LDPepperPizza();
        }
        if ("cheese".equals(orderType)) {
            return new LDCheesePizza();
        }
        return null;
    }
}
