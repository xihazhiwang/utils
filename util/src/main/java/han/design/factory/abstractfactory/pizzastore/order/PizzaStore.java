package han.design.factory.abstractfactory.pizzastore.order;

public class PizzaStore {

    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
    }

}
