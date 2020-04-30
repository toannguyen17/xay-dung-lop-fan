package app;

public class App {
    public static void main(String[] args) throws Exception {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        // setting fan 1
        fan1.setSpeed(Fan.FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setStatus(true);

        System.out.println(fan1.toString());

        // setting fan 2
        fan2.setSpeed(Fan.MEDIUM);
        fan2.setRadius(5);
        fan2.setColor("blue");
        System.out.println(fan2.toString());
    }
}