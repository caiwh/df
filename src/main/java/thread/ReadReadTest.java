package thread;

public class ReadReadTest {

    public static void main1(String[] args) {
        final MyTask myTask = new MyTask();
        
        Thread t1 = new Thread(new Runnable() {

            public void run() {
                myTask.write();
            }
        });
        t1.setName("t1");
        
        Thread t2 = new Thread(new Runnable() {

            public void run() {
                myTask.read();
            }
        });
        t2.setName("t2");
        
        t1.start();
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        t2.start();
    }

    public static void main(String[] args) {
        System.out.println(8<<2);
        System.out.println(9<<2);
    }
}