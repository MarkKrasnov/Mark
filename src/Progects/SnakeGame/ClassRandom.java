package Progects.SnakeGame;

import java.util.Random;

public class ClassRandom {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.out.print("\r\r" + new Random().nextInt(20));
            Thread.sleep(500);
        }
    }
}
