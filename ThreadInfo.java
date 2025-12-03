class MyThread extends Thread {
    public void run() {
        System.out.println("Inside run method.");
        System.out.println("Thread Name: " + getName());
        System.out.println("Thread ID: " + getId());
        System.out.println("Is Alive: " + isAlive());
    }
}

public class ThreadInfo {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.setName("CustomThread");
        t.start();
		
		try { 
		Thread.sleep(10); 
		} catch (InterruptedException e) { 
		
		}
		System.out.println("\nOutside run method.");
        System.out.println("Thread Name: " + t.getName());
        System.out.println("Thread ID: " + t.getId());
        System.out.println("Is Alive: " + t.isAlive());
    }
}
