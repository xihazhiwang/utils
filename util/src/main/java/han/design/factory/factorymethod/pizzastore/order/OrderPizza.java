package han.design.factory.factorymethod.pizzastore.order;

import han.design.factory.factorymethod.pizzastore.pizza.Pizza;
import jdk.nashorn.internal.objects.annotations.Getter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            pizza = createPizza(orderType); // 由工厂子类实现完成
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    /**
     * 定义抽象方法，createPizza
     */
    abstract Pizza createPizza(String orderType);

    // 获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type:");
            return br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
