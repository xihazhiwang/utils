package han.design.factory.factorymethod.pizzastore.order;

public class PizzaStore {

    public static void main(String[] args) {
        // 创建北京口味的各种披萨
        OrderPizza orderPizza = new BJOrderPizza();
    }

}
