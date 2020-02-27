package han.design.factory.abstractfactory.pizzastore.order;

import han.design.factory.abstractfactory.pizzastore.pizza.Pizza;

/**
 * 工厂模式的抽象层
 */
public abstract class AbstractFactory {

    /**
     * 工厂子类具体实现
     * @param orderType
     * @return
     */
    public abstract Pizza createPizza(String orderType);

}
