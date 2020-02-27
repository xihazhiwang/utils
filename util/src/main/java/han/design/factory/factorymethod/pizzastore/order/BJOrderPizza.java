package han.design.factory.factorymethod.pizzastore.order;

import han.design.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import han.design.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import han.design.factory.factorymethod.pizzastore.pizza.Pizza;

public class BJOrderPizza  extends OrderPizza {

    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if ("cheese".equals(orderType)) {
            pizza = new BJCheesePizza();
        }
        if ("pepper".equals(orderType)) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
