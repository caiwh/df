package thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    static int i = 0;
    public static void main(String[] args) {
        final Lock lock = new ReentrantLock();
        for (int j = 0; j < 10000; j++) {
            Thread t = new Thread(new Runnable() {
                public void run() {
                    lock.lock();
                    i++;
                    lock.unlock();
                }
            });
            t.start();
        }
        System.out.println(i);

    }
}
