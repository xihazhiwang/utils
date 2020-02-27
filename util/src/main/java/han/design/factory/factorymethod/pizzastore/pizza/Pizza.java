package han.design.factory.factorymethod.pizzastore.pizza;

/**
 * 工厂方法
 */
public abstract class Pizza {

    /**
     * 披萨的名字
     */
    protected String name;

    /**
     * 准备制作披萨，不同的披萨是不一样的。因此，这是个抽象方法
     */
    public abstract void prepare();

    public void bake() {
        System.out.println(name + "baking;");
    }

    public void cut() {
        System.out.println(name + "cutting;");
    }

    public void box() {
        System.out.println(name + "boxing;");
    }

    public void setName(String name) {
        this.name = name;
    }

}
