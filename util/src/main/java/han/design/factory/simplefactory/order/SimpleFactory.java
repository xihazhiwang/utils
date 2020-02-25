package han.design.factory.simplefactory.order;

import han.design.factory.simplefactory.pizza.pizzastore.CheesePizza;
import han.design.factory.simplefactory.pizza.pizzastore.GreekPizza;
import han.design.factory.simplefactory.pizza.pizzastore.PepperPizza;
import han.design.factory.simplefactory.pizza.pizzastore.Pizza;

/**
 * 简单工厂类
 */
public class SimpleFactory {

    /**
     * 根据orderType返回对应的披萨对象
     * @param orderType
     * @return
     */
    public Pizza createPizza(String orderType) {
        System.out.println("使用简单工厂模式");
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if (orderType.equals("pepper")) {
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }

}
