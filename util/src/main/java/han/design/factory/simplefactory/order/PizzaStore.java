package han.design.factory.simplefactory.order;

import han.design.factory.simplefactory.order.OrderPizza;

/**
 * 相当于一个客户端，发出订购任务
 */
public class PizzaStore {

    public static void main(String[] args) {
//        new OrderPizza();

        new OrderPizza(new SimpleFactory());
    }

}
