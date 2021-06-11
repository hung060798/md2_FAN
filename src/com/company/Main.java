package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println("Fan 1 Speed: " + fan1.getSpeed());
        System.out.println("Fan 1 Radius: " + fan1.getRadius());
        System.out.println("Fan 1 Color: " + fan1.getColor());
        System.out.println("Fan 1 Is On? = " + fan1.getOn());
        System.out.println(fan1.toString());
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setOn(false);
        System.out.println("Fan 2 Speed: " + fan2.getSpeed());
        System.out.println("Fan 2 Radius: " + fan2.getRadius());
        System.out.println("Fan 2 Color: " + fan2.getColor());
        System.out.println("Fan 2 Is On? = " + fan2.getOn());
        System.out.println(fan2.toString());
    }
}
