package org.example;

public class Main {
    public static void main(String[] args) {
        Point first = new Point(6, 5);

        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());

        Player player = new Player("sümeyye" , 100,Weapon.AXE);
          System.out.println("healthremaining: " + player.healthRemaining());

          Player player1 = new Player("hakan",90,Weapon.SWORD);
        System.out.println("healthremaining: " + player1.healthRemaining());


    }
}