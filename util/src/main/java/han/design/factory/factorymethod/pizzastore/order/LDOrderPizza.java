package han.design.factory.factorymethod.pizzastore.order;

import han.design.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import han.design.factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import han.design.factory.factorymethod.pizzastore.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {

    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new LDCheesePizza();
        }
        if ("pepper".equals(orderType)) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
