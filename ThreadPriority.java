class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }
    public void run() {
        System.out.println(getName() + " with priority " + getPriority());
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }
}
