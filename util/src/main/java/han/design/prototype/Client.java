package han.design.prototype;

public class Client {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Sheep sheep = new Sheep("tom", 1, "白色");
            System.out.println(sheep.toString());

        }
    }

}
