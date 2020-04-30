package app;

public class Fan {
    final static int SLOW   = 1;
    final static int MEDIUM = 2;
    final static int FAST   = 3;

    private int     speed;
    private boolean on;
    private double  radius;
    private String  color;

    Fan(){
        this.speed  = SLOW;
        this.on     = false;
        this.radius = 5;
        this.color  = "blue";
    }

    // get method
    public int getSpeed() {
        return speed;
    }

    public boolean getStatus() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // set method
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStatus(boolean status) {
        this.on = status;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //
    public String toString() {
        if (on) {
            return "fan is on, speed: " + speed + ", color: " + color + ", radius: " + radius;
        }else{
            return "fan is off";
        }
    }
}
