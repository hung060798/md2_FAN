package com.company;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {

    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean getOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setSpeed(int speed) {
        switch (speed) {
            case 1:
                 this.speed = this.SLOW;
            case 2:
                 this.speed = this.MEDIUM;
            case 3:
                 this.speed = this.FAST;
        }
    }

    public void setOn(boolean on){
        this.on = on;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColor(String color){
        this.color = color;
    }
    public String toString(){
        if(on){
            return "Speed " + this.speed + ", Color "+ this.color + ", Fan Radius " + this.radius + ", fan is on";
        }else {
            return "Color "+ this.color + ", Fan Radius " + this.radius + ", fan is off";
        }
    }
}
