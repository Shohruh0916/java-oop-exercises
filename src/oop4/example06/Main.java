package oop4.example06;

public class Main {
    public static void main(String[] args) {
        Ball ball = new Ball(50, 50, 5, 10, 45);
        Container container = new Container(0, 0, 100, 100);
        System.out.println(ball);
        System.out.println(container);
        for (int i = 0; i < 10; i++) {
            ball.move();
            if (container.collidesWith(ball)) {
                System.out.println("Collision detected!");
            }
            System.out.println(ball);
        }
    }
}
