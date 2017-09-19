/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread2;

public class CountingThread2 extends Thread {

    public static void main(String[] args) {

        Thread t1 = new CountingThread2() {
            @Override
            public void run() {
                try {

                    for (int i = 0; i < 11; i++) {
                        if (i == 6) {
                            sleep(1000);
                        }
                        System.out.print(" " + i + " ");
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        Thread t2 = new PrintOut();

        t1.start();
        t2.start();
    }
}

class PrintOut extends Thread {

    @Override
    public void run() {
        for (int a = 0; a < 10; a++) {
            System.out.print("A");
        }
    }
}
