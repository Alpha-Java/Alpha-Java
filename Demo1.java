package com;

/**
 * CPU占用过高
 */
public class Demo1 {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println(1);
            while (true) {

            }
        }, "thread1").start();

        new Thread(() -> {
            System.out.println(2);
            try {
                Thread.sleep(100000000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "thread2").start();

        new Thread(() -> {
            System.out.println(3);
            try {
                Thread.sleep(100000000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "thread3").start();



    }
}
