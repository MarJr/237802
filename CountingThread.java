package thread;

import static java.lang.Thread.sleep;

public class CountingThread extends Thread {

    int count = 0, limit = 51;

    public static void main(String[] args) {
        new Thread(new CountingThread()).start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 10500; i++) {
                System.out.println(i);
                sleep(100);
                count++;

                if (count == limit) {
                    int limit1 = limit - 1;
                    System.out.println("\nDah sampai " + limit1 + " daaa\n");
                    limit += 50;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
