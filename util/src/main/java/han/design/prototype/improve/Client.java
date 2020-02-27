package han.design.prototype.improve;

public class Client {

    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 2, "白色");

        // 对象需要实现cloneable，不然会报错
        sheep.clone();

    }

}
